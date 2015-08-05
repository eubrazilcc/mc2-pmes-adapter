package br.lncc.sinapad.adapter.bes.submission;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.adapter.bes.application.BESApplicationService;
import br.lncc.sinapad.adapter.bes.application.parser.ApplicationParser;
import br.lncc.sinapad.adapter.bes.application.xml.element.File;
import br.lncc.sinapad.adapter.bes.authentication.StorageCredentialImpl;
import br.lncc.sinapad.adapter.bes.file.BesFileUtils;
import br.lncc.sinapad.core.exception.ApplicationServiceException;
import br.lncc.sinapad.core.exception.SubmissionServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.submission.JobSubmissionService;

import com.bsc.pmes.client.PMESClient;
import com.bsc.pmes.client.credentials.StorageCredential;
import com.bsc.pmes.client.jobdescription.SingleJobGenerator;

/*
 * Para ser possível a execução, o sinapad.bes.adaper precisa ser compilado com
 * java-8-oracle
 */
public class BESJobSubmissionService implements JobSubmissionService {

	public File findStage(String k, String s) {
		for (File f : ApplicationParser.getStagein()) {
			if (k.equals(f.getName())) {
				f.setValue(s);
				return f;
			}
		}
		for (File f : ApplicationParser.getStageout()) {
			if (k.equals(f.getName())) {
				f.setValue(s);
				return f;
			}
		}
		return null;
	}

	public Boolean argumentIsFile(String k) {
		for (File f : ApplicationParser.getStagein()) {
			if (k.equals(f.getName())) {
				return true;
			}
		}
		for (File f : ApplicationParser.getStageout()) {
			if (k.equals(f.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String run(String uuid, String project, String application, String version, String resource, Map<String, String> args) throws SubmissionServiceException, UserNotAuthorizedException {

		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		BESApplicationService bas = new BESApplicationService();

		try {
			ApplicationParser.parse(bas.config(uuid, application, version));
		} catch (ApplicationServiceException e2) {
			e2.printStackTrace();
		}
		// Builds the JobDescription (jsdl) and executes it.
		if (ApplicationParser.isCompssApplication()) {
			// NOT IMPLEMENTED YET
		} else {

			SingleJobGenerator single = new SingleJobGenerator();
			StorageCredential storage_credencial = new StorageCredentialImpl();
			try {
				if (ApplicationParser.getApp_location() == null) {
					single.createApplication(application);
				} else {
					single.createApplication(BesFileUtils.getApplicationPathURL(uuid, project), storage_credencial);
				}
				single.createJobIdentification(application, version + " " + resource);
				for (String k : args.keySet()) {
					if (argumentIsFile(k)) {
						single.createArgument(ApplicationParser.getFile_deploy_path() + k);
						File f = findStage(k, args.get(k));
						if (f != null && f.getStage().toString().equals("IN")) {
							single.createStageIn(f.getName(), new URL(BESConfigurationService.besStorage() + BesFileUtils.getUserProjectPathFile(uuid, project, f.getValue())), ApplicationParser.getFile_deploy_path(), storage_credencial);
						} else if (f != null && f.getStage().toString().equals("OUT")) {
							single.createStageOut(f.getName(), ApplicationParser.getFile_deploy_path() + f.getName(), new URL(BESConfigurationService.besStorage() + BesFileUtils.getUserProjectPathFile(uuid, project, f.getValue())), storage_credencial, true);
						}
					} else {
						single.createArgument(args.get(k));
					}

				}
			} catch (MalformedURLException e) {
				throw new SubmissionServiceException("Could not read the URL");
			}
			/*
			 * try { single.createStageOut(application+".log",
			 * BesFileUtils.getUserProjectPathFile(uuid, project, "Manager1.log"),
			 * storage_credencial, true, true); } catch (MalformedURLException e1) {
			 * e1.printStackTrace(); }
			 */
			if (ApplicationParser.getClassPath() != null) {
				single.setClasspath(ApplicationParser.getClassPath());
			}
			if (ApplicationParser.getWallClockTime() != null) {
				single.setWallClockTime(Integer.valueOf(ApplicationParser.getWallClockTime()));
			}
			single.setExecutable(ApplicationParser.getApp_deploy_path() + ApplicationParser.getExecutable());
			single.setVMInfo(ApplicationParser.getVm());
			single.generateJobDescription(true);
			// -- MODIFIED API SECTION
			try {

				String jobId = client.createActivity(single.getJobDefinition());

				// single.printJSDLtoFile(BesFileUtils.getUserProjectPathFile(uuid,
				// project, jobId + ".jsdl", "LOCAL"));
				return jobId;
			} catch (Exception e) {
				throw new SubmissionServiceException("Could not submit the job: " + application);
			}
			// END OF MODIFIED API
		}
		return null;
	}

	@Override
	public String[] runBulk(String uuid, String project, String application, String version, String resource, Map<String, String> args, int beginValue, int endValue, int stepValue) throws SubmissionServiceException, UserNotAuthorizedException {
		// NOT IMPLEMENTED YET
		return null;
	}

	@Override
	public boolean cancel(String uuid, String project, String jobId) throws SubmissionServiceException, UserNotAuthorizedException {
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		String s[] = { jobId };
		try {
			client.terminateActivity(s);
			return true;
		} catch (Exception e) {
			throw new SubmissionServiceException("Could not cancel the job id: " + jobId);
		}
	}
}
