package br.lncc.sinapad.adapter.bes.monitoring;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.adapter.bes.utils.BesUtils;
import br.lncc.sinapad.core.data.FileData;
import br.lncc.sinapad.core.data.ResultData;
import br.lncc.sinapad.core.data.ResultData.Status;
import br.lncc.sinapad.core.exception.MonitoringServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.monitoring.JobMonitoringService;

import com.bsc.pmes.client.PMESClient;
import com.bsc.pmes.client.types.DataStageReport;
import com.bsc.pmes.client.types.JobStatus;

public class BESJobMonitoringService implements JobMonitoringService {

	@Override
	public List<ResultData> list(String uuid, String project, Date from, Date to) throws MonitoringServiceException, UserNotAuthorizedException {
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		List<ResultData> rdlist = new ArrayList<ResultData>();

		try {
			for (JobStatus j : client.getJobsStatus("all")) { // Retrieves all
																												// jobsStatuses
				rdlist.add(jobStatusToResultData(j));
			}
		} catch (Exception e) {
			throw new MonitoringServiceException("Could not retrieve the job status data!");
		}
		return rdlist;

	}

	// Converts a jobStatus to ResultData getting its id, start date, and end data
	public ResultData jobStatusToResultData(JobStatus js, String jobId, String uuid) throws MonitoringServiceException, UserNotAuthorizedException {
		ResultData rd = new ResultData();
		rd.setJobId(jobId);
		rd.setStartDate(BesUtils.stringToDate(js.getStartDate()));
		rd.setEndDate(BesUtils.stringToDate(js.getFinishDate()));
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		try {
			for (JobStatus jobfull : client.getJobsStatus("all")) {
				String ids[] = { jobId };
				Map<String, Object> map = new HashMap<String, Object>();
				int i = 1;
				for (String s : client.getActivityDocs(ids).get(0).getArguments()) {
					map.put("Argument " + i, s);
					i++;
				}
				rd.setResource(client.getActivityDocs(ids).get(0).getJobRes().getVMImage());

				rd.setParameters(map);
				if (jobfull.getEPR().equals(jobId)) {
					rd.setStartDate(BesUtils.stringToDate(jobfull.getStartDate()));
					rd.setEndDate(BesUtils.stringToDate(jobfull.getFinishDate()));
				}
			}
		} catch (Exception e) {
			throw new MonitoringServiceException("Could not retrieve job status data!");
		}

		switch (js.getStatus()) {
		case "FINISHED":
			rd.setStatus(Status.DONE);
			break;
		case "FAILED":
			rd.setStatus(Status.FAILED);
			break;
		case "PENDING":
			rd.setStatus(Status.WAITING);
			break;
		case "RUNNING":
			rd.setStatus(Status.RUNNING);
			break;
		}
		return rd;
	}

	// Converts a jobStatus to ResultData getting only its id;
	public ResultData jobStatusToResultData(JobStatus js) throws MonitoringServiceException {
		ResultData rd = new ResultData();
		rd.setJobId(js.getEPR());
		rd.setStartDate(BesUtils.stringToDate(js.getSubmitDate()));
		rd.setEndDate(BesUtils.stringToDate(js.getFinishDate()));
		switch (js.getStatus()) {
		case "FINISHED":
			rd.setStatus(Status.DONE);
			break;
		case "FAILED":
			rd.setStatus(Status.FAILED);
			break;
		case "PENDING":
			rd.setStatus(Status.WAITING);
			break;
		case "RUNNING":
			rd.setStatus(Status.RUNNING);
			break;
		}
		return rd;
	}

	@Override
	public ResultData get(String uuid, String project, String jobId) throws MonitoringServiceException, UserNotAuthorizedException {
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		String job[] = { jobId };
		try {
			return jobStatusToResultData(client.getActivityStatus(job).get(0), jobId, uuid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public InputStream log(String uuid, String project, String jobId) throws MonitoringServiceException, UserNotAuthorizedException {
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		String ids[] = { jobId };
		return null;

	}

	@Override
	public FileData history(String uuid, String project, String jobId, String[] parents, String file) throws MonitoringServiceException, UserNotAuthorizedException {
		// NEEDS WORK

		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		String job[] = { jobId };
		FileData fd = null;
		try {
			for (DataStageReport data : client.getActivityDocs(job).get(0).getDataStage()) {
				fd = new FileData(null, data.getName(), null, false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fd;
	}

	@Override
	public InputStream download(String uuid, String project, String jobId, String[] parents, String file) throws MonitoringServiceException, UserNotAuthorizedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String uuid, String project, String jobId) throws MonitoringServiceException, UserNotAuthorizedException {
		// TODO Auto-generated method stub
		return false;
	}
}
