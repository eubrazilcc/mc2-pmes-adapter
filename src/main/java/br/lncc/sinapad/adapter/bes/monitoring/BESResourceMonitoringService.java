package br.lncc.sinapad.adapter.bes.monitoring;

import java.util.List;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.core.data.ResourceData;
import br.lncc.sinapad.core.exception.MonitoringServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.monitoring.ResourceMonitoringService;

import com.bsc.pmes.client.PMESClient;

public class BESResourceMonitoringService implements ResourceMonitoringService {

	@Override
	public List<ResourceData> list(String uuid) throws MonitoringServiceException, UserNotAuthorizedException {
		// NOT IMPLEMENTED YET
		return null;
	}

	// The ResourceData Class cannot hold the same informations that the
	// getSystemStatus method retrieves from the server.
	@Override
	public ResourceData get(String uuid, String resource) throws MonitoringServiceException, UserNotAuthorizedException {
		PMESClient client = new PMESClient(BESConfigurationService.besAddress(), BESConfigurationService.retrieveBESCredential(uuid));
		ResourceData rd = new ResourceData();
		try {
			rd.setNumOfProc(client.getSystemStatus().getTotalCores());
		} catch (Exception e) {
			throw new MonitoringServiceException("Could not retrieve system information");
		}
		return rd;
	}

}
