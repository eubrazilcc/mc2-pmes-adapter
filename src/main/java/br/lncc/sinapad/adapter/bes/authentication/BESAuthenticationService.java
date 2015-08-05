package br.lncc.sinapad.adapter.bes.authentication;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.apache.http.auth.UsernamePasswordCredentials;

import br.lncc.sinapad.adapter.bes.BESConfigurationService;
import br.lncc.sinapad.adapter.bes.utils.LDAPUtils;
import br.lncc.sinapad.adapter.bes.utils.LDAPUtils.LDAPUserData;
import br.lncc.sinapad.core.data.UserData;
import br.lncc.sinapad.core.exception.AuthenticationServiceException;
import br.lncc.sinapad.core.exception.FileServiceException;
import br.lncc.sinapad.core.exception.UserNotAuthorizedException;
import br.lncc.sinapad.core.service.authentication.AuthenticationService;
import br.sinapad.cdmi.client.impl.CDMIClientImpl;
import br.sinapad.cdmi.client.impl.CDMIServiceException;

public class BESAuthenticationService implements AuthenticationService {

	@Override
	public String login(String userName, String password, Domain domain) throws AuthenticationServiceException {
		String uuid = null;
		UserData ud = new UserData();
		switch (domain) {
		case LDAP:
			LDAPUserData data = LDAPUtils.authenticate(userName, password, BESConfigurationService.ldapDn(), BESConfigurationService.ldapHost(), BESConfigurationService.ldapPort());
			if (data != null) {
				ud.setEmail(data.getEmail());
				ud.setFullName(data.getName());
				ud.setUsername(data.getUserName());
				uuid = UUID.randomUUID().toString();
				BESConfigurationService.registerUser(uuid, userName);
				BESConfigurationService.registerUserData(uuid, ud);
			}
			break;
		case VOMS:
			throw new AuthenticationServiceException("VOMS login requires a proxy certificate!");
		case RSA:
			throw new AuthenticationServiceException("Local login requires a certificate file!");
		}
		return uuid;
	}

	@Override
	public String login(String userName, InputStream cert, Domain domain) throws AuthenticationServiceException {

		CDMIClientImpl cdmiClient = null;

		try {
			cdmiClient = new CDMIClientImpl(new URL(BESConfigurationService.besStorage()), new UsernamePasswordCredentials(BESConfigurationService.besCredential().getUserName(), BESConfigurationService.besCredential().getPassword()));

			String uuid = null;
			UserData ud = new UserData();
			switch (domain) {
			case LDAP:
				throw new AuthenticationServiceException("LDAP login requires a username and password!");
			case VOMS:
				throw new AuthenticationServiceException("NOT IMPLEMENTED YET!");
			case RSA:
				String crt = BESConfigurationService.certsArea() + "/" + userName + "/" + "cert.crt";
				X509Certificate publicKey = readCertificate(cdmiClient.download(crt));
				PrivateKey privateKey = readPrivateKey(cert);

				KeyFactory fact = KeyFactory.getInstance("RSA");
				RSAPublicKeySpec pub = fact.getKeySpec(publicKey.getPublicKey(), RSAPublicKeySpec.class);
				RSAPrivateKeySpec priv = fact.getKeySpec(privateKey, RSAPrivateKeySpec.class);

				BigInteger e = pub.getModulus();
				BigInteger p = priv.getModulus();

				if (e.equals(p)) {
					ud.setUsername(userName);
					uuid = UUID.randomUUID().toString();
					BESConfigurationService.registerUser(uuid, userName);
					BESConfigurationService.registerUserData(uuid, ud);
				}
			}
			return uuid;
		} catch (MalformedURLException e1) {
			throw new AuthenticationServiceException("URL " + BESConfigurationService.besStorage() + " malformed");
		} catch (CDMIServiceException e1) {
			throw new AuthenticationServiceException("Could not instantiate the CDMI client");
		} catch (Exception e1) {
			throw new AuthenticationServiceException("Could not download the certificate or its wrong format");
		}

	}

	@Override
	public void logout(String uuid) throws AuthenticationServiceException, UserNotAuthorizedException {
		BESConfigurationService.unregisterUser(uuid);
	}

	public X509Certificate readCertificate(InputStream inputStream) throws Exception {
		X509Certificate x509certificate;
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		x509certificate = (X509Certificate) cf.generateCertificate(inputStream);
		inputStream.close();
		return x509certificate;
	}

	private PrivateKey readPrivateKey(InputStream file) throws Exception {
		byte encodedBytes[] = IOUtils.toByteArray(file);
		PKCS8EncodedKeySpec kspec = new PKCS8EncodedKeySpec(encodedBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		PrivateKey privKey = kf.generatePrivate(kspec);
		return privKey;
	}

	@Override
	public UserData info(String uuid) throws AuthenticationServiceException, UserNotAuthorizedException {
		return BESConfigurationService.retrieveUserData(uuid);
	}
}
