package br.lncc.sinapad.adapter.bes;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import br.lncc.sinapad.adapter.bes.exception.BESConfigurationServiceException;
import br.lncc.sinapad.core.data.UserData;
import br.lncc.sinapad.core.exception.ConfigurationServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.configuration.ConfigurationService;

import com.bsc.pmes.client.credentials.BESCredential;

public class BESConfigurationService implements ConfigurationService {

	public static final String LDAP_HOST = "ldap.host";
	public static final String LDAP_PORT = "ldap.port";
	public static final String LDAP_DN = "ldap.dn";
	public static final String BES_FILE_AREA = "bes.local.file.area";
	public static final String BES_CDMI_FILE_AREA = "bes.local.file.area";
	public static final String BES_PROJECTS_DIR = "projects";
	public static final String BES_APPLICATIONS_DIR = "applications";
	public static final String BES_CERTS_DIR = "certs";
	public static final String BES_ADDRESS = "bes.address";
	public static final String BES_STORAGE = "bes.cdmi.address";
	public static final String BES_FILE_DEPLOY_PATH = "bes.file.deploy.path";
	public static final String BES_APP_DEPLOY_PATH = "bes.app.deploy.path";
	public static final String BES_FILE_PROTOCOL = "bes.file.protocol";
	public static final String BES_CREDENTIAL_USER = "bes.credential.user";
	public static final String BES_CREDENTIAL_PASSWORD = "bes.credential.password";

	private static String ldapHost;
	private static int ldapPort;
	private static String ldapDn;
	private static String projects;
	private static String applications;
	private static String certs;
	private static String besAddress;
	private static String besStorage;
	private static String besFileDeployPath;
	private static String besAppDeployPath;
	private static String besFileProtocol;
	private static String besCredentialUser;
	private static String besCredentialPassword;

	private static Map<String, UserData> data = new HashMap<String, UserData>();

	@Override
	public void configure(Properties properties) throws ConfigurationServiceException {
		String ldapHost = properties.getProperty(LDAP_HOST);
		int ldapPort = Integer.parseInt(properties.getProperty(LDAP_PORT));
		String ldapDn = properties.getProperty(LDAP_DN);
		String besAddress = properties.getProperty(BES_ADDRESS);
		String besStorage = properties.getProperty(BES_STORAGE);
		String besAppDeployPath = properties.getProperty(BES_APP_DEPLOY_PATH);
		String besFileDeployPath = properties.getProperty(BES_FILE_DEPLOY_PATH);
		String besFileArea = properties.getProperty(BES_FILE_AREA);
		String besFileProtocol = properties.getProperty(BES_FILE_PROTOCOL);
		String besCredentialUser = properties.getProperty(BES_CREDENTIAL_USER);
		String besCredentialPassword = properties.getProperty(BES_CREDENTIAL_PASSWORD);
		String besCDMIFileArea = properties.getProperty(BES_CDMI_FILE_AREA);
		try {
			init(ldapHost, ldapPort, ldapDn, besAddress, besStorage, besFileDeployPath, besAppDeployPath, besFileArea, besFileProtocol, besCredentialUser, besCredentialPassword, besCDMIFileArea);
		} catch (BESConfigurationServiceException e) {
			throw new ConfigurationServiceException("Could not configure BES service", e);
		}
	}

	private void init(String ldapHost, int ldapPort, String ldapDn, String besAddress, String besStorage, String besFileDeployPath, String besAppDeployPath, String besFileArea, String besFileProtocol, String besCredentialUser, String besCredentialPassword, String besCDMIFileArea) throws BESConfigurationServiceException {
		BESConfigurationService.ldapHost = ldapHost;
		BESConfigurationService.ldapPort = ldapPort;
		BESConfigurationService.ldapDn = ldapDn;
		BESConfigurationService.besAddress = besAddress;
		BESConfigurationService.besStorage = besStorage;
		BESConfigurationService.besFileDeployPath = besFileDeployPath;
		BESConfigurationService.besAppDeployPath = besAppDeployPath;
		BESConfigurationService.besFileProtocol = besFileProtocol;
		BESConfigurationService.besCredentialUser = besCredentialUser;
		BESConfigurationService.besCredentialPassword = besCredentialPassword;

		/*
		 * if (!dir.exists()) { throw new
		 * BESConfigurationServiceException("The files area [" +
		 * dir.getAbsolutePath() + "] does not exist"); }
		 */
		String projects = "/" + BES_PROJECTS_DIR;
		/*
		 * if (!projects.exists()) { projects.mkdirs(); }
		 */
		BESConfigurationService.projects = projects;

		String applications = "/" + BES_APPLICATIONS_DIR;
		/*
		 * if (!applications.exists()) { applications.mkdirs(); }
		 */
		BESConfigurationService.applications = applications;

		String certs = "/" + BES_CERTS_DIR;
		BESConfigurationService.certs = certs;

	}

	public static BESCredential besCredential() {
		return new BESCredential(besCredentialUser, besCredentialPassword);
	}

	public static String besFileProtocol() {
		return BESConfigurationService.besFileProtocol;
	}

	public static String besFileDeployPath() {
		return BESConfigurationService.besFileDeployPath;
	}

	public static String besAppDeployPath() {
		return BESConfigurationService.besAppDeployPath;
	}

	public static String besStorage() {
		return BESConfigurationService.besStorage;
	}

	public static String besAddress() {
		return BESConfigurationService.besAddress;
	}

	public static String applicationArea() {
		return BESConfigurationService.applications;
	}

	public static String certsArea() {
		return BESConfigurationService.certs;
	}

	public static String projectArea() {
		return BESConfigurationService.projects;
	}

	public static String ldapHost() {
		return BESConfigurationService.ldapHost;
	}

	public static int ldapPort() {
		return BESConfigurationService.ldapPort;
	}

	public static String ldapDn() {
		return BESConfigurationService.ldapDn;
	}

	private static Map<String, String> users = new HashMap<String, String>();

	public static void registerUser(String uuid, String user) {
		users.put(uuid, user);
	}

	public static void unregisterUser(String uuid) {
		users.remove(uuid);
	}

	public static BESCredential retrieveBESCredential(String uuid) throws UserNotAuthorizedException {
		String user = users.get(uuid);

		if (user == null) {
			throw new UserNotAuthorizedException("User not authorized!");
		}
		return new BESCredential(BESConfigurationService.besCredentialUser, BESConfigurationService.besCredentialPassword); // Must
																																																												// be
																																																												// put
																																																												// in
																																																												// the
		// properties!
	}

	public static String retrieveUser(String uuid) throws UserNotAuthorizedException {
		String user = users.get(uuid);
		if (user == null) {
			throw new UserNotAuthorizedException("User not authorized!");
		}
		return user;
	}

	public static UserData retrieveUserData(String uuid) {
		return data.get(uuid);
	}

	public static void registerUserData(String uuid, UserData user) {
		data.put(uuid, user);
	}

	public static void removeUserData(String uuid) {
		data.remove(uuid);
	}

}
