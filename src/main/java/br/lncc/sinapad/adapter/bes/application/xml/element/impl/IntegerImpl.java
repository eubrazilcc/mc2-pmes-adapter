/*
 * XML Type: integer Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.Integer
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML integer(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class IntegerImpl extends br.lncc.sinapad.adapter.bes.application.xml.element.impl.ParameterImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.Integer {
	private static final long serialVersionUID = 1L;

	public IntegerImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName VALUE$0 = new javax.xml.namespace.QName("", "value");

	/**
	 * Gets the "value" attribute
	 */
	public java.math.BigInteger getValue() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$0);
			if (target == null) {
				return null;
			}
			return target.getBigIntegerValue();
		}
	}

	/**
	 * Gets (as xml) the "value" attribute
	 */
	public org.apache.xmlbeans.XmlInteger xgetValue() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInteger target = null;
			target = (org.apache.xmlbeans.XmlInteger) get_store().find_attribute_user(VALUE$0);
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
	public void setValue(java.math.BigInteger value) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(VALUE$0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(VALUE$0);
			}
			target.setBigIntegerValue(value);
		}
	}

	/**
	 * Sets (as xml) the "value" attribute
	 */
	public void xsetValue(org.apache.xmlbeans.XmlInteger value) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInteger target = null;
			target = (org.apache.xmlbeans.XmlInteger) get_store().find_attribute_user(VALUE$0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlInteger) get_store().add_attribute_user(VALUE$0);
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
