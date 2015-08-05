/*
 * XML Type: file Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.File
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML file(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class FileImpl extends br.lncc.sinapad.adapter.bes.application.xml.element.impl.ParameterImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.File {
	private static final long serialVersionUID = 1L;

	public FileImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName STAGE$0 = new javax.xml.namespace.QName("", "stage");
	private static final javax.xml.namespace.QName CATEGORY$2 = new javax.xml.namespace.QName("", "category");
	private static final javax.xml.namespace.QName VALUE$4 = new javax.xml.namespace.QName("", "value");

	/**
	 * Gets the "stage" attribute
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.Enum getStage() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(STAGE$0);
			if (target == null) {
				return null;
			}
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.Enum) target.getEnumValue();
		}
	}

	/**
	 * Gets (as xml) the "stage" attribute
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage xgetStage() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) get_store().find_attribute_user(STAGE$0);
			return target;
		}
	}

	/**
	 * Sets the "stage" attribute
	 */
	public void setStage(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.Enum stage) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(STAGE$0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(STAGE$0);
			}
			target.setEnumValue(stage);
		}
	}

	/**
	 * Sets (as xml) the "stage" attribute
	 */
	public void xsetStage(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage stage) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) get_store().find_attribute_user(STAGE$0);
			if (target == null) {
				target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage) get_store().add_attribute_user(STAGE$0);
			}
			target.set(stage);
		}
	}

	/**
	 * Gets the "category" attribute
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.Enum getCategory() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(CATEGORY$2);
			if (target == null) {
				return null;
			}
			return (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.Enum) target.getEnumValue();
		}
	}

	/**
	 * Gets (as xml) the "category" attribute
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File.Category xgetCategory() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File.Category target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) get_store().find_attribute_user(CATEGORY$2);
			return target;
		}
	}

	/**
	 * True if has "category" attribute
	 */
	public boolean isSetCategory() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(CATEGORY$2) != null;
		}
	}

	/**
	 * Sets the "category" attribute
	 */
	public void setCategory(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.Enum category) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(CATEGORY$2);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(CATEGORY$2);
			}
			target.setEnumValue(category);
		}
	}

	/**
	 * Sets (as xml) the "category" attribute
	 */
	public void xsetCategory(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category category) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File.Category target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) get_store().find_attribute_user(CATEGORY$2);
			if (target == null) {
				target = (br.lncc.sinapad.adapter.bes.application.xml.element.File.Category) get_store().add_attribute_user(CATEGORY$2);
			}
			target.set(category);
		}
	}

	/**
	 * Unsets the "category" attribute
	 */
	public void unsetCategory() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_attribute(CATEGORY$2);
		}
	}

	/**
	 * Gets the "value" attribute
	 */
	public java.lang.String getValue() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$4);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "value" attribute
	 */
	public org.apache.xmlbeans.XmlString xgetValue() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(VALUE$4);
			return target;
		}
	}

	/**
	 * True if has "value" attribute
	 */
	public boolean isSetValue() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(VALUE$4) != null;
		}
	}

	/**
	 * Sets the "value" attribute
	 */
	public void setValue(java.lang.String value) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$4);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(VALUE$4);
			}
			target.setStringValue(value);
		}
	}

	/**
	 * Sets (as xml) the "value" attribute
	 */
	public void xsetValue(org.apache.xmlbeans.XmlString value) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(VALUE$4);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(VALUE$4);
			}
			target.set(value);
		}
	}

	/**
	 * Unsets the "value" attribute
	 */
	public void unsetValue() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_attribute(VALUE$4);
		}
	}

	/**
	 * An XML stage(@).
	 *
	 * This is an atomic type that is a restriction of
	 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Stage.
	 */
	public static class StageImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage {
		private static final long serialVersionUID = 1L;

		public StageImpl(org.apache.xmlbeans.SchemaType sType) {
			super(sType, false);
		}

		protected StageImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
			super(sType, b);
		}
	}

	/**
	 * An XML category(@).
	 *
	 * This is an atomic type that is a restriction of
	 * br.lncc.sinapad.adapter.bes.application.xml.element.File$Category.
	 */
	public static class CategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements br.lncc.sinapad.adapter.bes.application.xml.element.File.Category {
		private static final long serialVersionUID = 1L;

		public CategoryImpl(org.apache.xmlbeans.SchemaType sType) {
			super(sType, false);
		}

		protected CategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
			super(sType, b);
		}
	}
}
