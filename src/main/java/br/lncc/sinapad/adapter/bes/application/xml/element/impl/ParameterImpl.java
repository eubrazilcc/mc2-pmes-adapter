/*
 * XML Type: parameter Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.Parameter
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML
 * parameter(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.Parameter {
	private static final long serialVersionUID = 1L;

	public ParameterImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName NAME$0 = new javax.xml.namespace.QName("", "name");
	private static final javax.xml.namespace.QName LABEL$2 = new javax.xml.namespace.QName("", "label");
	private static final javax.xml.namespace.QName TIP$4 = new javax.xml.namespace.QName("", "tip");

	/**
	 * Gets the "name" attribute
	 */
	public java.lang.String getName() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(NAME$0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "name" attribute
	 */
	public org.apache.xmlbeans.XmlString xgetName() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(NAME$0);
			return target;
		}
	}

	/**
	 * Sets the "name" attribute
	 */
	public void setName(java.lang.String name) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(NAME$0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(NAME$0);
			}
			target.setStringValue(name);
		}
	}

	/**
	 * Sets (as xml) the "name" attribute
	 */
	public void xsetName(org.apache.xmlbeans.XmlString name) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(NAME$0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(NAME$0);
			}
			target.set(name);
		}
	}

	/**
	 * Gets the "label" attribute
	 */
	public java.lang.String getLabel() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(LABEL$2);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "label" attribute
	 */
	public org.apache.xmlbeans.XmlString xgetLabel() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(LABEL$2);
			return target;
		}
	}

	/**
	 * True if has "label" attribute
	 */
	public boolean isSetLabel() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(LABEL$2) != null;
		}
	}

	/**
	 * Sets the "label" attribute
	 */
	public void setLabel(java.lang.String label) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(LABEL$2);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(LABEL$2);
			}
			target.setStringValue(label);
		}
	}

	/**
	 * Sets (as xml) the "label" attribute
	 */
	public void xsetLabel(org.apache.xmlbeans.XmlString label) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(LABEL$2);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(LABEL$2);
			}
			target.set(label);
		}
	}

	/**
	 * Unsets the "label" attribute
	 */
	public void unsetLabel() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_attribute(LABEL$2);
		}
	}

	/**
	 * Gets the "tip" attribute
	 */
	public java.lang.String getTip() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(TIP$4);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "tip" attribute
	 */
	public org.apache.xmlbeans.XmlString xgetTip() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(TIP$4);
			return target;
		}
	}

	/**
	 * True if has "tip" attribute
	 */
	public boolean isSetTip() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(TIP$4) != null;
		}
	}

	/**
	 * Sets the "tip" attribute
	 */
	public void setTip(java.lang.String tip) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(TIP$4);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(TIP$4);
			}
			target.setStringValue(tip);
		}
	}

	/**
	 * Sets (as xml) the "tip" attribute
	 */
	public void xsetTip(org.apache.xmlbeans.XmlString tip) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(TIP$4);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(TIP$4);
			}
			target.set(tip);
		}
	}

	/**
	 * Unsets the "tip" attribute
	 */
	public void unsetTip() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_attribute(TIP$4);
		}
	}
}
