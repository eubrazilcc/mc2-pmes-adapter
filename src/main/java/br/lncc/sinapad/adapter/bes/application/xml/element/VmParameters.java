/*
 * XML Type: vm-parameters Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element;

/**
 * An XML
 * vm-parameters(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public interface VmParameters extends org.apache.xmlbeans.XmlObject {
	public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VmParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("vmparameters5d0atype");

	/**
	 * Gets the "vm" element
	 */
	java.lang.String getVm();

	/**
	 * Gets (as xml) the "vm" element
	 */
	org.apache.xmlbeans.XmlString xgetVm();

	/**
	 * True if has "vm" element
	 */
	boolean isSetVm();

	/**
	 * Sets the "vm" element
	 */
	void setVm(java.lang.String vm);

	/**
	 * Sets (as xml) the "vm" element
	 */
	void xsetVm(org.apache.xmlbeans.XmlString vm);

	/**
	 * Unsets the "vm" element
	 */
	void unsetVm();

	/**
	 * Gets the "memory" element
	 */
	double getMemory();

	/**
	 * Gets (as xml) the "memory" element
	 */
	org.apache.xmlbeans.XmlDouble xgetMemory();

	/**
	 * True if has "memory" element
	 */
	boolean isSetMemory();

	/**
	 * Sets the "memory" element
	 */
	void setMemory(double memory);

	/**
	 * Sets (as xml) the "memory" element
	 */
	void xsetMemory(org.apache.xmlbeans.XmlDouble memory);

	/**
	 * Unsets the "memory" element
	 */
	void unsetMemory();

	/**
	 * Gets the "cores" element
	 */
	int getCores();

	/**
	 * Gets (as xml) the "cores" element
	 */
	org.apache.xmlbeans.XmlInt xgetCores();

	/**
	 * True if has "cores" element
	 */
	boolean isSetCores();

	/**
	 * Sets the "cores" element
	 */
	void setCores(int cores);

	/**
	 * Sets (as xml) the "cores" element
	 */
	void xsetCores(org.apache.xmlbeans.XmlInt cores);

	/**
	 * Unsets the "cores" element
	 */
	void unsetCores();

	/**
	 * Gets the "size" element
	 */
	double getSize();

	/**
	 * Gets (as xml) the "size" element
	 */
	org.apache.xmlbeans.XmlDouble xgetSize();

	/**
	 * True if has "size" element
	 */
	boolean isSetSize();

	/**
	 * Sets the "size" element
	 */
	void setSize(double size);

	/**
	 * Sets (as xml) the "size" element
	 */
	void xsetSize(org.apache.xmlbeans.XmlDouble size);

	/**
	 * Unsets the "size" element
	 */
	void unsetSize();

	/**
	 * A factory class with static methods for creating instances of this type.
	 */

	public static final class Factory {
		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters newInstance() {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
		}

		/**
		 * @param xmlAsString
		 *          the string value to parse
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
		}

		/**
		 * @param file
		 *          the file from which to load an xml document
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, options);
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
