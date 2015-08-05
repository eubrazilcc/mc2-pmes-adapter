/*
 * XML Type: file Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.File
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element;

/**
 * An XML file(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public interface File extends br.lncc.sinapad.adapter.bes.application.xml.element.Parameter {
	public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(File.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("file7878type");

	/**
	 * Gets the "stage" attribute
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.Enum getStage();

	/**
	 * Gets (as xml) the "stage" attribute
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage xgetStage();

	/**
	 * Sets the "stage" attribute
	 */
	void setStage(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.Enum stage);

	/**
	 * Sets (as xml) the "stage" attribute
	 */
	void xsetStage(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage stage);

	/**
	 * Gets the "category" attribute
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.Enum getCategory();

	/**
	 * Gets (as xml) the "category" attribute
	 */
	br.lncc.sinapad.adapter.bes.application.xml.element.File.Category xgetCategory();

	/**
	 * True if has "category" attribute
	 */
	boolean isSetCategory();

	/**
	 * Sets the "category" attribute
	 */
	void setCategory(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.Enum category);

	/**
	 * Sets (as xml) the "category" attribute
	 */
	void xsetCategory(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category category);

	/**
	 * Unsets the "category" attribute
	 */
	void unsetCategory();

	/**
	 * Gets the "value" attribute
	 */
	java.lang.String getValue();

	/**
	 * Gets (as xml) the "value" attribute
	 */
	org.apache.xmlbeans.XmlString xgetValue();

	/**
	 * True if has "value" attribute
	 */
	boolean isSetValue();

	/**
	 * Sets the "value" attribute
	 */
	void setValue(java.lang.String value);

	/**
	 * Sets (as xml) the "value" attribute
	 */
	void xsetValue(org.apache.xmlbeans.XmlString value);

	/**
	 * Unsets the "value" attribute
	 */
	void unsetValue();

	/**
	 * An XML stage(@).
	 *
	 * This is an atomic type that is a restriction of
	 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Stage.
	 */
	public interface Stage extends org.apache.xmlbeans.XmlString {
		public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("stage1a52attrtype");

		org.apache.xmlbeans.StringEnumAbstractBase enumValue();

		void set(org.apache.xmlbeans.StringEnumAbstractBase e);

		static final Enum IN = Enum.forString("IN");
		static final Enum OUT = Enum.forString("OUT");

		static final int INT_IN = Enum.INT_IN;
		static final int INT_OUT = Enum.INT_OUT;

		/**
		 * Enumeration value class for
		 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Stage. These
		 * enum values can be used as follows:
		 * 
		 * <pre>
		 * enum.toString(); // returns the string value of the enum
		 * enum.intValue(); // returns an int value, useful for switches
		 * // e.g., case Enum.INT_IN
		 * Enum.forString(s); // returns the enum value for a string
		 * Enum.forInt(i); // returns the enum value for an int
		 * </pre>
		 * 
		 * Enumeration objects are immutable singleton objects that can be compared
		 * using == object equality. They have no public constructor. See the
		 * constants defined within this class for all the valid values.
		 */
		static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
			/**
			 * Returns the enum value for a string, or null if none.
			 */
			public static Enum forString(java.lang.String s) {
				return (Enum) table.forString(s);
			}

			/**
			 * Returns the enum value corresponding to an int, or null if none.
			 */
			public static Enum forInt(int i) {
				return (Enum) table.forInt(i);
			}

			private Enum(java.lang.String s, int i) {
				super(s, i);
			}

			static final int INT_IN = 1;
			static final int INT_OUT = 2;

			public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table = new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] { new Enum("IN", INT_IN), new Enum("OUT", INT_OUT), });
			private static final long serialVersionUID = 1L;

			private java.lang.Object readResolve() {
				return forInt(intValue());
			}
		}

		/**
		 * A factory class with static methods for creating instances of this type.
		 */

		public static final class Factory {
			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage newValue(java.lang.Object obj) {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) type.newValue(obj);
			}

			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage newInstance() {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
			}

			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage newInstance(org.apache.xmlbeans.XmlOptions options) {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
			}

			private Factory() {} // No instance of this class allowed
		}
	}

	/**
	 * An XML category(@).
	 *
	 * This is an atomic type that is a restriction of
	 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Category.
	 */
	public interface Category extends org.apache.xmlbeans.XmlString {
		public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Category.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s796FAEA8231F26767EF7AAE1ACAE9394").resolveHandle("category829aattrtype");

		org.apache.xmlbeans.StringEnumAbstractBase enumValue();

		void set(org.apache.xmlbeans.StringEnumAbstractBase e);

		static final Enum DIRECTORY = Enum.forString("directory");
		static final Enum FILE = Enum.forString("file");

		static final int INT_DIRECTORY = Enum.INT_DIRECTORY;
		static final int INT_FILE = Enum.INT_FILE;

		/**
		 * Enumeration value class for
		 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Category. These
		 * enum values can be used as follows:
		 * 
		 * <pre>
		 * enum.toString(); // returns the string value of the enum
		 * enum.intValue(); // returns an int value, useful for switches
		 * // e.g., case Enum.INT_DIRECTORY
		 * Enum.forString(s); // returns the enum value for a string
		 * Enum.forInt(i); // returns the enum value for an int
		 * </pre>
		 * 
		 * Enumeration objects are immutable singleton objects that can be compared
		 * using == object equality. They have no public constructor. See the
		 * constants defined within this class for all the valid values.
		 */
		static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
			/**
			 * Returns the enum value for a string, or null if none.
			 */
			public static Enum forString(java.lang.String s) {
				return (Enum) table.forString(s);
			}

			/**
			 * Returns the enum value corresponding to an int, or null if none.
			 */
			public static Enum forInt(int i) {
				return (Enum) table.forInt(i);
			}

			private Enum(java.lang.String s, int i) {
				super(s, i);
			}

			static final int INT_DIRECTORY = 1;
			static final int INT_FILE = 2;

			public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table = new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] { new Enum("directory", INT_DIRECTORY), new Enum("file", INT_FILE), });
			private static final long serialVersionUID = 1L;

			private java.lang.Object readResolve() {
				return forInt(intValue());
			}
		}

		/**
		 * A factory class with static methods for creating instances of this type.
		 */

		public static final class Factory {
			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Category newValue(java.lang.Object obj) {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) type.newValue(obj);
			}

			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Category newInstance() {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
			}

			public static br.lncc.sinapad.adapter.bes.application.xml.element.File.Category newInstance(org.apache.xmlbeans.XmlOptions options) {
				return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
			}

			private Factory() {} // No instance of this class allowed
		}
	}

	/**
	 * A factory class with static methods for creating instances of this type.
	 */

	public static final class Factory {
		public static br.lncc.sinapad.adapter.bes.application.xml.element.File newInstance() {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File newInstance(org.apache.xmlbeans.XmlOptions options) {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance(type, options);
		}

		/**
		 * @param xmlAsString
		 *          the string value to parse
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
		}

		/**
		 * @param file
		 *          the file from which to load an xml document
		 */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(file, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(u, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(is, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(r, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(sr, type, options);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, null);
		}

		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(node, type, options);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, null);
		}

		/** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
		public static br.lncc.sinapad.adapter.bes.application.xml.element.File parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse(xis, type, options);
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
