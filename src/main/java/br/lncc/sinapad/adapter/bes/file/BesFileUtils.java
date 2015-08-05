package br.lncc.sinapad.adapter.bes.file;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.adapter.bes.application.parser.ApplicationParser;
import br.lncc.sinapad.adapter.bes.utils.BesUtils;
import br.lncc.sinapad.core.exception.FileServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;

public class BesFileUtils {

	public static final String CDMI = "CDMI";
	public static final String LOCAL = "LOCAL";

	public static String getApplicationPath(String uuid, String project) throws MalformedURLException {
		return ApplicationParser.getApp_location();
	}

	public static URL getApplicationPathURL(String uuid, String project) throws MalformedURLException {
		return new URL(BESConfigurationService.besStorage() + ApplicationParser.getApp_location());
	}

	public static String getUserProjectPathFile(String uuid, String project, String file) throws UserNotAuthorizedException, MalformedURLException {
		try {
			return "/" + "projects" + "/" + BESConfigurationService.retrieveUser(uuid) + "/" + project + "/" + file;
		} catch (UserNotAuthorizedException e) {
			throw new UserNotAuthorizedException("User not authorized!");
		}
	}

	public static String getUserProjectPath(String uuid, String project) throws UserNotAuthorizedException, MalformedURLException {
		try {
			return "/" + "projects" + "/" + BESConfigurationService.retrieveUser(uuid) + "/" + project;
		} catch (UserNotAuthorizedException e) {
			throw new UserNotAuthorizedException("User not authorized!");
		}
	}

	public static String getUserAreaPath(String uuid, String project) throws UserNotAuthorizedException, MalformedURLException {
		try {
			return "/" + "projects" + "/" + BESConfigurationService.retrieveUser(uuid);
		} catch (UserNotAuthorizedException e) {
			throw new UserNotAuthorizedException("User not authorized!");
		}
	}

	public static String getCDMITargetPath(String uuid, String project, String[] parents, String fileName) throws MalformedURLException, UserNotAuthorizedException {

		try {
			if (parents != null && fileName == null) {
				return BesFileUtils.getUserProjectPathFile(uuid, project, BesUtils.stringArrayToHTMLString(parents));
			} else if (parents != null && fileName != null) {
				return BesFileUtils.getUserProjectPathFile(uuid, project, BesUtils.stringArrayToHTMLString(parents) + "/" + fileName);
			} else if (fileName != null && parents == null) {
				return BesFileUtils.getUserProjectPathFile(uuid, project, fileName);
			} else if (fileName == null && parents == null) {
				return BesFileUtils.getUserProjectPathFile(uuid, project, "");
			}
		} catch (MalformedURLException e) {
			throw new MalformedURLException("Could not read the url");
		} catch (UserNotAuthorizedException e) {
			throw new UserNotAuthorizedException("User not authorized");
		}
		return null;
	}
}
