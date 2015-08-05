package br.lncc.sinapad.adapter.bes.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import br.lncc.sinapad.core.exception.AuthenticationServiceException;

import com.novell.ldap.LDAPAttribute;
import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPException;
import com.novell.ldap.LDAPJSSESecureSocketFactory;

public class LDAPUtils {

	public static final String CN = "cn";
	public static final String SN = "sn";
	public static final String MAIL = "mail";
	public static final String O = "o";

	public static LDAPUserData authenticate(String userName, String password, String dn, String ldapHost, int ldapPort) throws AuthenticationServiceException {
		return authenticate(userName, password, dn, ldapHost, ldapPort, false, null, null);
	}

	public static LDAPUserData authenticate(String userName, String password, String dn, String ldapHost, int ldapPort, boolean ssl, String keyStorePassword, String keyStorePath) throws AuthenticationServiceException {
		if (userName == null || password == null) {
			throw new AuthenticationServiceException("Username and password cannot be null");
		}

		if (userName.isEmpty() || password.isEmpty()) {
			throw new AuthenticationServiceException("Username and password cannot be empty");
		}

		String pattern = "cn=" + userName + "," + dn;
		byte[] passwd = password.getBytes();
		LDAPConnection conn = null;
		if (ssl) {
			conn = getLdapConnection(keyStorePassword, keyStorePath);
		} else {
			conn = getLdapConnection();
		}
		try {
			conn.connect(ldapHost, ldapPort);
			conn.bind(LDAPConnection.LDAP_V3, pattern, passwd);
			if (conn.getAuthenticationDN() != null) {
				LDAPEntry entry = conn.read(pattern);
				LDAPUserData user = new LDAPUserData();
				user.setName(getValue(entry, SN));
				user.setEmail(getValue(entry, MAIL));
				user.setUserName(getValue(entry, CN));
				user.setRole(getValue(entry, O));
				return user;
			}
		} catch (LDAPException e) {
			if (e.getResultCode() != 49) {
				throw new AuthenticationServiceException("Error while trying to authenticate the user", e);
			}
		} finally {
			try {
				conn.disconnect();
			} catch (LDAPException e) {
				// do nothing
			}
		}
		return null;
	}

	private static String getValue(LDAPEntry entry, String id) {
		LDAPAttribute attr = entry.getAttribute(id);
		if (attr != null) {
			return attr.getStringValue();
		}
		return null;
	}

	private static LDAPConnection getLdapConnection() throws AuthenticationServiceException {
		return getLdapConnection(null, null);
	}

	private static LDAPConnection getLdapConnection(String keyStorePassword, String keyStorePath) throws AuthenticationServiceException {
		LDAPConnection conn = null;
		if (keyStorePassword != null && keyStorePath != null) {
			LDAPJSSESecureSocketFactory ssf = null;
			try {
				SSLContext context = SSLContext.getInstance("TLS", "SunJSSE");
				InputStream keyStoreIStream = null;
				char[] keyStorePass = null;
				if (keyStorePassword != null && !keyStorePassword.equals("")) {
					keyStorePass = keyStorePassword.toCharArray();
				}
				File key = new File(keyStorePath);
				if (key.exists()) {
					// Open the stream to read in the keystore.
					keyStoreIStream = new FileInputStream(keyStorePath);
				} else {
					keyStoreIStream = LDAPUtils.class.getResourceAsStream("/" + keyStorePath);
				}

				KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				// Init the Keystore with the contents of the keystore file.
				// If the input stream is null the keystore is initialized
				// empty.
				keyStore.load(keyStoreIStream, keyStorePass);

				TrustManager[] tms = { new LDAPTrustManager(keyStore) };
				context.init(null, tms, null);
				ssf = new LDAPJSSESecureSocketFactory(context.getSocketFactory());
			} catch (Exception e) {
				throw new AuthenticationServiceException("Error while configuring LDAP with SSL", e);
			}
			conn = new LDAPConnection(ssf);
		} else {
			conn = new LDAPConnection();
		}

		return conn;
	}

	public static class LDAPUserData {
		private String name;
		private String email;
		private String userName;
		private String role;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

	}

}

class LDAPTrustManager implements X509TrustManager {

	private KeyStore keyStore;

	public LDAPTrustManager(KeyStore keyStore) {
		this.keyStore = keyStore;
	}

	public void checkClientTrusted(X509Certificate[] chain, String arg1) throws CertificateException {
		boolean trusted = isChainTrusted(chain);
		if (!trusted) {
			throw new CertificateException("Client is not trusted");
		}

	}

	public void checkServerTrusted(X509Certificate[] chain, String arg1) throws CertificateException {
		boolean trusted = isChainTrusted(chain);
		if (!trusted) {
			throw new CertificateException("Server is not trusted");
		}
	}

	public X509Certificate[] getAcceptedIssuers() {
		X509Certificate[] X509Certs = null;
		try {
			// See how many certificates are in the keystore.
			int numberOfEntry = keyStore.size();
			// If there are any certificates in the keystore.
			if (numberOfEntry > 0) {
				// Create an array of X509Certificates
				X509Certs = new X509Certificate[numberOfEntry];
				// Get all of the certificate alias out of the keystore.
				Enumeration<String> aliases = keyStore.aliases();
				// Retrieve all of the certificates out of the keystore
				// via the alias name.
				int i = 0;
				while (aliases.hasMoreElements()) {
					X509Certs[i] = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
					i++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			X509Certs = null;
		}
		return X509Certs;
	}

	private boolean isChainTrusted(X509Certificate[] chain) {
		boolean trusted = false;
		try {
			// Start with the root and see if it is in the Keystore.
			// The root is at the end of the chain.
			for (int i = chain.length - 1; i >= 0; i--) {
				if (keyStore.getCertificateAlias(chain[i]) != null) {
					trusted = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			trusted = false;
		}
		return trusted;
	}
}
