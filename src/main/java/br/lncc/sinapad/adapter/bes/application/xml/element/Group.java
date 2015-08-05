/*
 * XML Type: group Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.Group
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element;

/**
 * An XML group(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public interface Group extends org.apache.xmlbeans.XmlObject {
	public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Group.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("groupa349type");

	/**
	 * Gets array of all "string" elements
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.String[] getStringArray();

	/**
	 * Gets ith "string" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.String getStringArray(int i);

	/**
	 * Returns number of "string" element
	 */
	int sizeOfStringArray();

	/**
	 * Sets array of all "string" element
	 */
	void setStringArray(br.lncc.sinapad.adapter.bes.application.xml.element.String[] stringArray);

	/**
	 * Sets ith "string" element
	 */
	void setStringArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.String string);

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "string" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.String insertNewString(int i);

	/**
	 * Appends and returns a new empty value (as xml) as the last "string" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.String addNewString();

	/**
	 * Removes the ith "string" element
	 */
	void removeString(int i);

	/**
	 * Gets array of all "file" elements
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File[] getFileArray();

	/**
	 * Gets ith "file" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File getFileArray(int i);

	/**
	 * Returns number of "file" element
	 */
	int sizeOfFileArray();

	/**
	 * Sets array of all "file" element
	 */
	void setFileArray(br.lncc.sinapad.adapter.bes.application.xml.element.File[] fileArray);

	/**
	 * Sets ith "file" element
	 */
	void setFileArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.File file);

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "file" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File insertNewFile(int i);

	/**
	 * Appends and returns a new empty value (as xml) as the last "file" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File addNewFile();

	/**
	 * Removes the ith "file" element
	 */
	void removeFile(int i);

	/**
	 * Gets array of all "double" elements
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Double[] getDoubleArray();

	/**
	 * Gets ith "double" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Double getDoubleArray(int i);

	/**
	 * Returns number of "double" element
	 */
	int sizeOfDoubleArray();

	/**
	 * Sets array of all "double" element
	 */
	void setDoubleArray(br.lncc.sinapad.adapter.bes.application.xml.element.Double[] xdoubleArray);

	/**
	 * Sets ith "double" element
	 */
	void setDoubleArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Double xdouble);

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "double" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Double insertNewDouble(int i);

	/**
	 * Appends and returns a new empty value (as xml) as the last "double" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Double addNewDouble();

	/**
	 * Removes the ith "double" element
	 */
	void removeDouble(int i);

	/**
	 * Gets array of all "integer" elements
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Integer[] getIntegerArray();

	/**
	 * Gets ith "integer" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Integer getIntegerArray(int i);

	/**
	 * Returns number of "integer" element
	 */
	int sizeOfIntegerArray();

	/**
	 * Sets array of all "integer" element
	 */
	void setIntegerArray(br.lncc.sinapad.adapter.bes.application.xml.element.Integer[] integerArray);

	/**
	 * Sets ith "integer" element
	 */
	void setIntegerArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Integer integer);

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "integer" element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Integer insertNewInteger(int i);

	/**
	 * Appends and returns a new empty value (as xml) as the last "integer"
	 * element
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.Integer addNewInteger();

	/**
	 * Removes the ith "integer" element
	 */
	void removeInteger(int i);

	/**
	 * Gets the "label" attribute
	 */
	java.lang.String getLabel();

	/**
	 * Gets (as xml) the "label" attribute
	 */
	org.apache.xmlbeans.XmlString xgetLabel();

	/**
	 * True if has "label" attribute
	 */
	boolean isSetLabel();

	/**
	 * Sets the "label" attribute
	 */
	void setLabel(java.lang.String label);

	/**
	 * Sets (as xml) the "label" attribute
	 */
	void xsetLabel(org.apache.xmlbeans.XmlString label);

	/**
	 * Unsets the "label" attribute
	 */
	void unsetLabel();

	/**
	 * A factory class with static methods for creating instances of this type.
	 */

	public static final class Factory {
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group newInstance() {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group newInstance(org.apache.xmlbeans.XmlOptions options) {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
		}

		/**
		 * @param xmlAsString
		 *          the string value to parse
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
		}

		/**
		 * @param file
		 *          the file from which to load an xml document
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.Group parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, options);
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
