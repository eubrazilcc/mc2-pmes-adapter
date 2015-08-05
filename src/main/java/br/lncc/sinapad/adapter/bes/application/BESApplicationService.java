package br.lncc.sinapad.adapter.bes.application;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.auth.UsernamePasswordCredentials;

import com.ctc.wstx.util.StringUtil;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.core.data.ApplicationData;
import br.lncc.sinapad.core.data.ApplicationData.VersionData;
import br.lncc.sinapad.core.exception.ApplicationServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.application.ApplicationService;
import br.sinapad.cdmi.client.impl.CDMIClientImpl;
import br.sinapad.cdmi.client.impl.CDMIServiceException;

public class BESApplicationService implements ApplicationService {

	@Override
	public List<ApplicationData> list(String uuid) throws ApplicationServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;

		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			BESConfigurationService.retrieveUser(uuid);
			List<ApplicationData> adList = new ArrayList<ApplicationData>();
			for (String f : cdmiClient.listDir(BESConfigurationService.applicationArea())) {
				ApplicationData ad = new ApplicationData();
				ad.setName(f);
				String path = BESConfigurationService.applicationArea() + "/" + f;
				if (cdmiClient.exists(path + "/app.info")) {
					String info = "";
					info = IOUtils.toString(cdmiClient.download(path + "/app.info"));
					ad.setInfo(info);
				} else {
					ad.setInfo("app info");
				}
				System.out.println(ad.getInfo());
				VersionData vdata = new VersionData();
				String versions = BESConfigurationService.applicationArea() + "/" + f + "/" + "versions";
				if (cdmiClient.exists(versions)) {
					ad.setVersions(getVersions(versions));
					adList.add(ad);
				}
			}
			return adList;
		} catch (CDMIServiceException e) {
			throw new ApplicationServiceException("Could not instantiate the CDMI client");
		} catch (IOException e) {
			throw new ApplicationServiceException("Could not convert the downloaded InputStream to String");
		}
	}

	private List<VersionData> getVersions(String versionDir) throws ApplicationServiceException {
		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));

			VersionData vdata = new VersionData();
			List<VersionData> vlist = new ArrayList<VersionData>();
			if (cdmiClient.listDir(versionDir) == null) {
				throw new ApplicationServiceException("There are no versions for this application");
			}
			for (String v : cdmiClient.listDir(versionDir)) {
				v = StringUtils.removeEnd(v, "/");
				vdata.setInfo("version info");
				vdata.setVersion(v);
				// vdata.setQueues(queues);
				vlist.add(vdata);
				vdata = new VersionData();
			}
			return vlist;
		} catch (CDMIServiceException e) {
			throw new ApplicationServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new ApplicationServiceException("The URL " + BESConfigurationService.besStorage() + " is malformed");
		}
	}

	@Override
	public ApplicationData get(String uuid, String application) throws ApplicationServiceException, UserNotAuthorizedException {

		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			BESConfigurationService.retrieveUser(uuid);
			for (String f : cdmiClient.listDir(BESConfigurationService.applicationArea())) {
				f = StringUtils.removeEnd(f, "/");
				if (f.equals(application)) {
					ApplicationData ad = new ApplicationData();
					ad.setInfo("App info");
					ad.setName(f);
					String versions = BESConfigurationService.applicationArea() + "/" + f + "/versions";
					ad.setVersions(getVersions(versions));
					return ad;
				}
			}
			return null;
		} catch (CDMIServiceException e) {
			throw new ApplicationServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new ApplicationServiceException("The URL " + BESConfigurationService.besStorage() + " is malformed");
		}

	}

	@Override
	public InputStream config(String uuid, String application, String version) throws ApplicationServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));

			BESConfigurationService.retrieveUser(uuid);
			for (VersionData vd : get(uuid, application).getVersions()) {
				if (vd.getVersion().equals(version)) {
					String configfile = BESConfigurationService.applicationArea() + "/" + application + "/" + "versions" + "/" + vd.getVersion() + "/" + "config" + "/" + "AppConfig.xml";
					return cdmiClient.download(configfile);
				}
			}
		} catch (CDMIServiceException e) {
			throw new ApplicationServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new ApplicationServiceException("The URL " + BESConfigurationService.besStorage() + " is malformed");
		}
		return null;
	}
}
