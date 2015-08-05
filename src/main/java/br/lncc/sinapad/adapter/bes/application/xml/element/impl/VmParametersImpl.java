/*
 * XML Type: vm-parameters Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML
 * vm-parameters(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class VmParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters {
	private static final long serialVersionUID = 1L;

	public VmParametersImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName VM$0 = new javax.xml.namespace.QName("", "vm");
	private static final javax.xml.namespace.QName MEMORY$2 = new javax.xml.namespace.QName("", "memory");
	private static final javax.xml.namespace.QName CORES$4 = new javax.xml.namespace.QName("", "cores");
	private static final javax.xml.namespace.QName SIZE$6 = new javax.xml.namespace.QName("", "size");

	/**
	 * Gets the "vm" element
	 */
	public java.lang.String getVm() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(VM$0, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "vm" element
	 */
	public org.apache.xmlbeans.XmlString xgetVm() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(VM$0, 0);
			return target;
		}
	}

	/**
	 * True if has "vm" element
	 */
	public boolean isSetVm() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(VM$0) != 0;
		}
	}

	/**
	 * Sets the "vm" element
	 */
	public void setVm(java.lang.String vm) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(VM$0, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(VM$0);
			}
			target.setStringValue(vm);
		}
	}

	/**
	 * Sets (as xml) the "vm" element
	 */
	public void xsetVm(org.apache.xmlbeans.XmlString vm) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(VM$0, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(VM$0);
			}
			target.set(vm);
		}
	}

	/**
	 * Unsets the "vm" element
	 */
	public void unsetVm() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(VM$0, 0);
		}
	}

	/**
	 * Gets the "memory" element
	 */
	public double getMemory() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MEMORY$2, 0);
			if (target == null) {
				return 0.0;
			}
			return target.getDoubleValue();
		}
	}

	/**
	 * Gets (as xml) the "memory" element
	 */
	public org.apache.xmlbeans.XmlDouble xgetMemory() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlDouble target = null;
			target = (org.apache.xmlbeans.XmlDouble) get_store().find_element_user(MEMORY$2, 0);
			return target;
		}
	}

	/**
	 * True if has "memory" element
	 */
	public boolean isSetMemory() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(MEMORY$2) != 0;
		}
	}

	/**
	 * Sets the "memory" element
	 */
	public void setMemory(double memory) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MEMORY$2, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(MEMORY$2);
			}
			target.setDoubleValue(memory);
		}
	}

	/**
	 * Sets (as xml) the "memory" element
	 */
	public void xsetMemory(org.apache.xmlbeans.XmlDouble memory) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlDouble target = null;
			target = (org.apache.xmlbeans.XmlDouble) get_store().find_element_user(MEMORY$2, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlDouble) get_store().add_element_user(MEMORY$2);
			}
			target.set(memory);
		}
	}

	/**
	 * Unsets the "memory" element
	 */
	public void unsetMemory() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(MEMORY$2, 0);
		}
	}

	/**
	 * Gets the "cores" element
	 */
	public int getCores() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CORES$4, 0);
			if (target == null) {
				return 0;
			}
			return target.getIntValue();
		}
	}

	/**
	 * Gets (as xml) the "cores" element
	 */
	public org.apache.xmlbeans.XmlInt xgetCores() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInt target = null;
			target = (org.apache.xmlbeans.XmlInt) get_store().find_element_user(CORES$4, 0);
			return target;
		}
	}

	/**
	 * True if has "cores" element
	 */
	public boolean isSetCores() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(CORES$4) != 0;
		}
	}

	/**
	 * Sets the "cores" element
	 */
	public void setCores(int cores) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CORES$4, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CORES$4);
			}
			target.setIntValue(cores);
		}
	}

	/**
	 * Sets (as xml) the "cores" element
	 */
	public void xsetCores(org.apache.xmlbeans.XmlInt cores) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInt target = null;
			target = (org.apache.xmlbeans.XmlInt) get_store().find_element_user(CORES$4, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlInt) get_store().add_element_user(CORES$4);
			}
			target.set(cores);
		}
	}

	/**
	 * Unsets the "cores" element
	 */
	public void unsetCores() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(CORES$4, 0);
		}
	}

	/**
	 * Gets the "size" element
	 */
	public double getSize() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(SIZE$6, 0);
			if (target == null) {
				return 0.0;
			}
			return target.getDoubleValue();
		}
	}

	/**
	 * Gets (as xml) the "size" element
	 */
	public org.apache.xmlbeans.XmlDouble xgetSize() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlDouble target = null;
			target = (org.apache.xmlbeans.XmlDouble) get_store().find_element_user(SIZE$6, 0);
			return target;
		}
	}

	/**
	 * True if has "size" element
	 */
	public boolean isSetSize() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(SIZE$6) != 0;
		}
	}

	/**
	 * Sets the "size" element
	 */
	public void setSize(double size) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(SIZE$6, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(SIZE$6);
			}
			target.setDoubleValue(size);
		}
	}

	/**
	 * Sets (as xml) the "size" element
	 */
	public void xsetSize(org.apache.xmlbeans.XmlDouble size) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlDouble target = null;
			target = (org.apache.xmlbeans.XmlDouble) get_store().find_element_user(SIZE$6, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlDouble) get_store().add_element_user(SIZE$6);
			}
			target.set(size);
		}
	}

	/**
	 * Unsets the "size" element
	 */
	public void unsetSize() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(SIZE$6, 0);
		}
	}
}
