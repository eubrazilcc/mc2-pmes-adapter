/*
 * XML Type: double Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.Double
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element;

/**
 * An XML double(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public interface Double extends br.lncc.sinapad.adapter.bes.application.xml.element.Parameter {
	public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Double.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("double530dtype");

	/**
	 * Gets the "value" attribute
	 */
	double getValue();

	/**
	 * Gets (as xml) the "value" attribute
	 */
	org.apache.xmlbeans.XmlDouble xgetValue();

	/**
	 * True if has "value" attribute
	 */
	boolean isSetValue();

	/**
	 * Sets the "value" attribute
	 */
	void setValue(double value);

	/**
	 * Sets (as xml) the "value" attribute
	 */
	void xsetValue(org.apache.xmlbeans.XmlDouble value);

	/**
	 * Unsets the "value" attribute
	 */
	void unsetValue();

	/**
	 * A factory class with static methods for creating instances of this type.
	 */

	public static final class Factory {
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double newInstance() {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double newInstance(org.apache.xmlbeans.XmlOptions options) {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
		}

		/**
		 * @param xmlAsString
		 *          the string value to parse
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
		}

		/**
		 * @param file
		 *          the file from which to load an xml document
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Double parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Double) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, options);
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
