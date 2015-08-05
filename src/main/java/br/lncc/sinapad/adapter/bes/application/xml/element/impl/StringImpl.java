/*
 * XML Type: string Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.String
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML string(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class StringImpl extends br.lncc.sinapad.adapter.bes.application.xml.element.impl.ParameterImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.String {
	private static final long serialVersionUID = 1L;

	public StringImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName VALUE$0 = new javax.xml.namespace.QName("", "value");

	/**
	 * Gets the "value" attribute
	 */
	public java.lang.String getValue() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$0);
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
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(VALUE$0);
			return target;
		}
	}

	/**
	 * True if has "value" attribute
	 */
	public boolean isSetValue() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(VALUE$0) != null;
		}
	}

	/**
	 * Sets the "value" attribute
	 */
	public void setValue(java.lang.String value) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(VALUE$0);
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
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(VALUE$0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(VALUE$0);
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
			get_store().remove_attribute(VALUE$0);
		}
	}
}
