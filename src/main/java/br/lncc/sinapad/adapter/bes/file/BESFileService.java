package br.lncc.sinapad.adapter.bes.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.auth.UsernamePasswordCredentials;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.adapter.bes.utils.BesUtils;
import br.lncc.sinapad.core.data.FileData;
import br.lncc.sinapad.core.exception.ApplicationServiceException;
import br.lncc.sinapad.core.exception.FileServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.file.FileService;
import br.sinapad.cdmi.client.impl.CDMIClientImpl;
import br.sinapad.cdmi.client.impl.CDMIServiceException;

public class BESFileService implements FileService {

	@Override
	public FileData find(String uuid, String project, String[] parents, String file) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			String userArea = BESConfigurationService.projectArea() + "/" + BESConfigurationService.retrieveUser(uuid);
			String projectArea = userArea + "/" + project;
			if (!cdmiClient.exists(userArea)) {
				throw new FileServiceException("User [" + BESConfigurationService.retrieveUser(uuid) + "] area does not exist!");
			}
			if (!cdmiClient.exists(projectArea)) {
				throw new FileServiceException("Project [" + project + "] does not exist for user [" + BESConfigurationService.retrieveUser(uuid) + "]");
			}

			FileData last = new FileData(null, project, null, true);

			String f = projectArea;
			if (parents != null) {
				for (String parent : parents) {
					last = new FileData(null, parent, last, true);
					f = f + "/" + parent;
				}
			}
			if (file != null) {
				f = f + "/" + file;
				last = new FileData(null, file, last, cdmiClient.isDirectory(f));
			}
			if (!cdmiClient.exists(f)) {
				return null;
			}
			if (!cdmiClient.isDirectory(f)) {
				return last;
			} else {

				for (String l : cdmiClient.listDir(f)) {
					l = StringUtils.removeEnd(l, "/");
					String a = f + "/" + l;
					boolean b = cdmiClient.isDirectory(a);
					last.addChild(new FileData(null, l, last, b));
				}
				return last;
			}
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client " + e);
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean exists(String uuid, String project, String[] parents, String file) throws FileServiceException, UserNotAuthorizedException {

		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));

			try {
				return cdmiClient.exists(getCDMITargetPath(uuid, project, parents, file));
			} catch (Exception e) {
				// If some error occurs the file does not exist.
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean delete(String uuid, String project, String[] parents, String file) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			try {
				return cdmiClient.delete(getCDMITargetPath(uuid, project, parents, file));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean create(String uuid, String project, String[] parents, String file, boolean directory) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));

			if (BESConfigurationService.retrieveUser(uuid) == null) {
				throw new FileServiceException("User not authorized!");
			}
			String userArea = BESConfigurationService.projectArea() + "/" + BESConfigurationService.retrieveUser(uuid);
			String projectArea = userArea + "/" + project;
			if (!cdmiClient.exists(userArea)) {
				throw new FileServiceException("User [" + BESConfigurationService.retrieveUser(uuid) + "] area does not exist!");
			}
			if (!cdmiClient.exists(projectArea)) {
				throw new FileServiceException("Project [" + project + "] does not exist for user [" + BESConfigurationService.retrieveUser(uuid) + "]");
			}
			String s;
			s = getCDMITargetPath(uuid, project, parents, file);
			if (!exists(uuid, project, parents, file)) {
				if (file != null) {
					if (!directory) {
						return cdmiClient.upload(s, IOUtils.toInputStream(""), false);
					} else {
						return cdmiClient.mkdirs(s);
					}
				}
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL is Malformed");
		}

	}

	@Override
	public boolean move(String uuid, String project, String[] to, String[] from, String file) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			InputStream is = download(uuid, project, from, file);
			if (is != null) {
				if (upload(uuid, project, to, file, is, true)) {
					return delete(uuid, project, from, file);
				}
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean copy(String uuid, String project, String[] to, String[] from, String file) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			InputStream is = download(uuid, project, from, file);
			if (is != null) {
				return upload(uuid, project, to, file, is, true);
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean rename(String uuid, String project, String[] parents, String oldName, String newName) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			InputStream is = download(uuid, project, parents, oldName);
			if (is != null) {
				if (upload(uuid, project, parents, newName, is, true)) {
					return delete(uuid, project, parents, oldName);
				}
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	@Override
	public boolean upload(String uuid, String project, String[] parents, String fileName, File file, boolean override) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			return upload(uuid, project, parents, fileName, new FileInputStream(file), override);
		} catch (FileNotFoundException e) {
			throw new FileServiceException("Could not upload the file:" + fileName);
		}
	}

	@Override
	public boolean upload(String uuid, String project, String[] parents, String fileName, InputStream file, boolean override) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			String userArea = BESConfigurationService.projectArea() + "/" + BESConfigurationService.retrieveUser(uuid);
			String projectArea = userArea + "/" + project;
			if (!cdmiClient.exists(userArea)) {
				throw new FileServiceException("User [" + BESConfigurationService.retrieveUser(uuid) + "] area does not exist!");
			}
			if (!cdmiClient.exists(projectArea)) {
				throw new FileServiceException("Project [" + project + "] does not exist for user [" + BESConfigurationService.retrieveUser(uuid) + "]");
			}

			if (file != null) {
				try {
					return cdmiClient.upload(getCDMITargetPath(uuid, project, parents, fileName), file, override);
				} catch (IOException e) {
					throw new FileServiceException("Could not upload the file: " + file);
				}
			}
			return false;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

	private String getCDMITargetPath(String uuid, String project, String[] parents, String fileName) throws MalformedURLException, UserNotAuthorizedException {

		try {
			// Só pega usuario
			String path = "";
			if (parents != null && fileName == null) {
				path = BesFileUtils.getUserProjectPathFile(uuid, project, BesUtils.stringArrayToHTMLString(parents));
			} else if (parents != null && fileName != null) {
				path = BesFileUtils.getUserProjectPathFile(uuid, project, BesUtils.stringArrayToHTMLString(parents) + "/" + fileName);
			} else if (parents == null && fileName != null) {
				path = BesFileUtils.getUserProjectPathFile(uuid, project, fileName);
			} else if (fileName == null && parents == null) {
				path = BesFileUtils.getUserProjectPath(uuid, project);
			}
			return path;
		} catch (MalformedURLException e) {
			throw new MalformedURLException("Could not read the url");
		} catch (UserNotAuthorizedException e) {
			throw new UserNotAuthorizedException("User not authorized");
		}
	}

	@Override
	public InputStream download(String uuid, String project, String[] parents, String file) throws FileServiceException, UserNotAuthorizedException {
		CDMIClientImpl cdmiClient = null;
		BESConfigurationService.retrieveUser(uuid);
		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));
			InputStream is;
			try {
				return cdmiClient.download(getCDMITargetPath(uuid, project, parents, file));
			} catch (Exception e) {
				// If some error occurs the file does not exist.
			}
			return null;
		} catch (CDMIServiceException e) {
			throw new FileServiceException("Could not instantiate the CDMI client");
		} catch (MalformedURLException e) {
			throw new FileServiceException("The URL " + BESConfigurationService.BES_STORAGE + " is Malformed");
		}

	}

}
