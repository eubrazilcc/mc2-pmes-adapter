/*
 * XML Type: app-config Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element;

/**
 * An XML
 * app-config(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public interface AppConfig extends org.apache.xmlbeans.XmlObject {
	public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("appconfig05aatype");

	/**
	 * Gets the "wallclocktime" element
	 */
	int getWallclocktime();

	/**
	 * Gets (as xml) the "wallclocktime" element
	 */
	org.apache.xmlbeans.XmlInt xgetWallclocktime();

	/**
	 * True if has "wallclocktime" element
	 */
	boolean isSetWallclocktime();

	/**
	 * Sets the "wallclocktime" element
	 */
	void setWallclocktime(int wallclocktime);

	/**
	 * Sets (as xml) the "wallclocktime" element
	 */
	void xsetWallclocktime(org.apache.xmlbeans.XmlInt wallclocktime);

	/**
	 * Unsets the "wallclocktime" element
	 */
	void unsetWallclocktime();

	/**
	 * Gets the "classpath" element
	 */
	java.lang.String getClasspath();

	/**
	 * Gets (as xml) the "classpath" element
	 */
	org.apache.xmlbeans.XmlString xgetClasspath();

	/**
	 * True if has "classpath" element
	 */
	boolean isSetClasspath();

	/**
	 * Sets the "classpath" element
	 */
	void setClasspath(java.lang.String classpath);

	/**
	 * Sets (as xml) the "classpath" element
	 */
	void xsetClasspath(org.apache.xmlbeans.XmlString classpath);

	/**
	 * Unsets the "classpath" element
	 */
	void unsetClasspath();

	/**
	 * Gets the "executable" element
	 */
	java.lang.String getExecutable();

	/**
	 * Gets (as xml) the "executable" element
	 */
	org.apache.xmlbeans.XmlString xgetExecutable();

	/**
	 * True if has "executable" element
	 */
	boolean isSetExecutable();

	/**
	 * Sets the "executable" element
	 */
	void setExecutable(java.lang.String executable);

	/**
	 * Sets (as xml) the "executable" element
	 */
	void xsetExecutable(org.apache.xmlbeans.XmlString executable);

	/**
	 * Unsets the "executable" element
	 */
	void unsetExecutable();

	/**
	 * Gets array of all "group" elements
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Group[] getGroupArray();

	/**
	 * Gets ith "group" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Group getGroupArray(int i);

	/**
	 * Returns number of "group" element
	 */
	int sizeOfGroupArray();

	/**
	 * Sets array of all "group" element
	 */
	void setGroupArray(br.lncc.sinapad.adapter.bes.application.xml.element.Group[] groupArray);

	/**
	 * Sets ith "group" element
	 */
	void setGroupArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Group group);

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "group" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Group insertNewGroup(int i);

	/**
	 * Appends and returns a new empty value (as xml) as the last "group" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Group addNewGroup();

	/**
	 * Removes the ith "group" element
	 */
	void removeGroup(int i);

	/**
	 * Gets the "compss" element
	 */
	boolean getCompss();

	/**
	 * Gets (as xml) the "compss" element
	 */
	org.apache.xmlbeans.XmlBoolean xgetCompss();

	/**
	 * True if has "compss" element
	 */
	boolean isSetCompss();

	/**
	 * Sets the "compss" element
	 */
	void setCompss(boolean compss);

	/**
	 * Sets (as xml) the "compss" element
	 */
	void xsetCompss(org.apache.xmlbeans.XmlBoolean compss);

	/**
	 * Unsets the "compss" element
	 */
	void unsetCompss();

	/**
	 * Gets the "vm-parameters" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters getVmParameters();

	/**
	 * True if has "vm-parameters" element
	 */
	boolean isSetVmParameters();

	/**
	 * Sets the "vm-parameters" element
	 */
	void setVmParameters(br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters vmParameters);

	/**
	 * Appends and returns a new empty "vm-parameters" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters addNewVmParameters();

	/**
	 * Unsets the "vm-parameters" element
	 */
	void unsetVmParameters();

	/**
	 * Gets the "app-location" element
	 */
	java.lang.String getAppLocation();

	/**
	 * Gets (as xml) the "app-location" element
	 */
	org.apache.xmlbeans.XmlString xgetAppLocation();

	/**
	 * True if has "app-location" element
	 */
	boolean isSetAppLocation();

	/**
	 * Sets the "app-location" element
	 */
	void setAppLocation(java.lang.String appLocation);

	/**
	 * Sets (as xml) the "app-location" element
	 */
	void xsetAppLocation(org.apache.xmlbeans.XmlString appLocation);

	/**
	 * Unsets the "app-location" element
	 */
	void unsetAppLocation();

	/**
	 * Gets the "pmes-deploy-path" element
	 */
	java.lang.String getPmesDeployPath();

	/**
	 * Gets (as xml) the "pmes-deploy-path" element
	 */
	org.apache.xmlbeans.XmlString xgetPmesDeployPath();

	/**
	 * True if has "pmes-deploy-path" element
	 */
	boolean isSetPmesDeployPath();

	/**
	 * Sets the "pmes-deploy-path" element
	 */
	void setPmesDeployPath(java.lang.String pmesDeployPath);

	/**
	 * Sets (as xml) the "pmes-deploy-path" element
	 */
	void xsetPmesDeployPath(org.apache.xmlbeans.XmlString pmesDeployPath);

	/**
	 * Unsets the "pmes-deploy-path" element
	 */
	void unsetPmesDeployPath();

	/**
	 * Gets the "pmes-app-deploy-path" element
	 */
	java.lang.String getPmesAppDeployPath();

	/**
	 * Gets (as xml) the "pmes-app-deploy-path" element
	 */
	org.apache.xmlbeans.XmlString xgetPmesAppDeployPath();

	/**
	 * True if has "pmes-app-deploy-path" element
	 */
	boolean isSetPmesAppDeployPath();

	/**
	 * Sets the "pmes-app-deploy-path" element
	 */
	void setPmesAppDeployPath(java.lang.String pmesAppDeployPath);

	/**
	 * Sets (as xml) the "pmes-app-deploy-path" element
	 */
	void xsetPmesAppDeployPath(org.apache.xmlbeans.XmlString pmesAppDeployPath);

	/**
	 * Unsets the "pmes-app-deploy-path" element
	 */
	void unsetPmesAppDeployPath();

	/**
	 * A factory class with static methods for creating instances of this type.
	 */

	public static final class Factory {
		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig newInstance() {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
		}

		/**
		 * @param xmlAsString
		 *          the string value to parse
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
		}

		/**
		 * @param file
		 *          the file from which to load an xml document
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, options);
		}

		private Factory() {} // No instance of this class allowed
	}
}
