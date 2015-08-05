/*
 * XML Type: group Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.Group
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML group(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class GroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.Group {
	private static final long serialVersionUID = 1L;

	public GroupImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName STRING$0 = new javax.xml.namespace.QName("", "string");
	private static final javax.xml.namespace.QName FILE$2 = new javax.xml.namespace.QName("", "file");
	private static final javax.xml.namespace.QName DOUBLE$4 = new javax.xml.namespace.QName("", "double");
	private static final javax.xml.namespace.QName INTEGER$6 = new javax.xml.namespace.QName("", "integer");
	private static final javax.xml.namespace.QName LABEL$8 = new javax.xml.namespace.QName("", "label");

	/**
	 * Gets array of all "string" elements
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.String[] getStringArray() {
		synchronized (monitor()) {
			check_orphaned();
			java.util.List targetList = new java.util.ArrayList();
			get_store().find_all_element_users(STRING$0, targetList);
			br.lncc.sinapad.adapter.bes.application.xml.element.String[] result = new br.lncc.sinapad.adapter.bes.application.xml.element.String[targetList.size()];
			targetList.toArray(result);
			return result;
		}
	}

	/**
	 * Gets ith "string" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.String getStringArray(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.String target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.String) get_store().find_element_user(STRING$0, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			return target;
		}
	}

	/**
	 * Returns number of "string" element
	 */
	public int sizeOfStringArray() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(STRING$0);
		}
	}

	/**
	 * Sets array of all "string" element WARNING: This method is not atomicaly
	 * synchronized.
	 */
	public void setStringArray(br.lncc.sinapad.adapter.bes.application.xml.element.String[] stringArray) {
		check_orphaned();
		arraySetterHelper(stringArray, STRING$0);
	}

	/**
	 * Sets ith "string" element
	 */
	public void setStringArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.String string) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.String target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.String) get_store().find_element_user(STRING$0, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			target.set(string);
		}
	}

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "string" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.String insertNewString(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.String target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.String) get_store().insert_element_user(STRING$0, i);
			return target;
		}
	}

	/**
	 * Appends and returns a new empty value (as xml) as the last "string" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.String addNewString() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.String target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.String) get_store().add_element_user(STRING$0);
			return target;
		}
	}

	/**
	 * Removes the ith "string" element
	 */
	public void removeString(int i) {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(STRING$0, i);
		}
	}

	/**
	 * Gets array of all "file" elements
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File[] getFileArray() {
		synchronized (monitor()) {
			check_orphaned();
			java.util.List targetList = new java.util.ArrayList();
			get_store().find_all_element_users(FILE$2, targetList);
			br.lncc.sinapad.adapter.bes.application.xml.element.File[] result = new br.lncc.sinapad.adapter.bes.application.xml.element.File[targetList.size()];
			targetList.toArray(result);
			return result;
		}
	}

	/**
	 * Gets ith "file" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File getFileArray(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File) get_store().find_element_user(FILE$2, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			return target;
		}
	}

	/**
	 * Returns number of "file" element
	 */
	public int sizeOfFileArray() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(FILE$2);
		}
	}

	/**
	 * Sets array of all "file" element WARNING: This method is not atomicaly
	 * synchronized.
	 */
	public void setFileArray(br.lncc.sinapad.adapter.bes.application.xml.element.File[] fileArray) {
		check_orphaned();
		arraySetterHelper(fileArray, FILE$2);
	}

	/**
	 * Sets ith "file" element
	 */
	public void setFileArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.File file) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File) get_store().find_element_user(FILE$2, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			target.set(file);
		}
	}

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "file" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File insertNewFile(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File) get_store().insert_element_user(FILE$2, i);
			return target;
		}
	}

	/**
	 * Appends and returns a new empty value (as xml) as the last "file" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.File addNewFile() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.File target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.File) get_store().add_element_user(FILE$2);
			return target;
		}
	}

	/**
	 * Removes the ith "file" element
	 */
	public void removeFile(int i) {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(FILE$2, i);
		}
	}

	/**
	 * Gets array of all "double" elements
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Double[] getDoubleArray() {
		synchronized (monitor()) {
			check_orphaned();
			java.util.List targetList = new java.util.ArrayList();
			get_store().find_all_element_users(DOUBLE$4, targetList);
			br.lncc.sinapad.adapter.bes.application.xml.element.Double[] result = new br.lncc.sinapad.adapter.bes.application.xml.element.Double[targetList.size()];
			targetList.toArray(result);
			return result;
		}
	}

	/**
	 * Gets ith "double" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Double getDoubleArray(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Double target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Double) get_store().find_element_user(DOUBLE$4, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			return target;
		}
	}

	/**
	 * Returns number of "double" element
	 */
	public int sizeOfDoubleArray() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(DOUBLE$4);
		}
	}

	/**
	 * Sets array of all "double" element WARNING: This method is not atomicaly
	 * synchronized.
	 */
	public void setDoubleArray(br.lncc.sinapad.adapter.bes.application.xml.element.Double[] xdoubleArray) {
		check_orphaned();
		arraySetterHelper(xdoubleArray, DOUBLE$4);
	}

	/**
	 * Sets ith "double" element
	 */
	public void setDoubleArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Double xdouble) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Double target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Double) get_store().find_element_user(DOUBLE$4, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			target.set(xdouble);
		}
	}

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "double" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Double insertNewDouble(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Double target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Double) get_store().insert_element_user(DOUBLE$4, i);
			return target;
		}
	}

	/**
	 * Appends and returns a new empty value (as xml) as the last "double" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Double addNewDouble() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Double target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Double) get_store().add_element_user(DOUBLE$4);
			return target;
		}
	}

	/**
	 * Removes the ith "double" element
	 */
	public void removeDouble(int i) {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(DOUBLE$4, i);
		}
	}

	/**
	 * Gets array of all "integer" elements
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Integer[] getIntegerArray() {
		synchronized (monitor()) {
			check_orphaned();
			java.util.List targetList = new java.util.ArrayList();
			get_store().find_all_element_users(INTEGER$6, targetList);
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer[] result = new br.lncc.sinapad.adapter.bes.application.xml.element.Integer[targetList.size()];
			targetList.toArray(result);
			return result;
		}
	}

	/**
	 * Gets ith "integer" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Integer getIntegerArray(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Integer) get_store().find_element_user(INTEGER$6, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			return target;
		}
	}

	/**
	 * Returns number of "integer" element
	 */
	public int sizeOfIntegerArray() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(INTEGER$6);
		}
	}

	/**
	 * Sets array of all "integer" element WARNING: This method is not atomicaly
	 * synchronized.
	 */
	public void setIntegerArray(br.lncc.sinapad.adapter.bes.application.xml.element.Integer[] integerArray) {
		check_orphaned();
		arraySetterHelper(integerArray, INTEGER$6);
	}

	/**
	 * Sets ith "integer" element
	 */
	public void setIntegerArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Integer integer) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Integer) get_store().find_element_user(INTEGER$6, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			target.set(integer);
		}
	}

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "integer" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Integer insertNewInteger(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Integer) get_store().insert_element_user(INTEGER$6, i);
			return target;
		}
	}

	/**
	 * Appends and returns a new empty value (as xml) as the last "integer"
	 * element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Integer addNewInteger() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Integer) get_store().add_element_user(INTEGER$6);
			return target;
		}
	}

	/**
	 * Removes the ith "integer" element
	 */
	public void removeInteger(int i) {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(INTEGER$6, i);
		}
	}

	/**
	 * Gets the "label" attribute
	 */
	public java.lang.String getLabel() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(LABEL$8);
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
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(LABEL$8);
			return target;
		}
	}

	/**
	 * True if has "label" attribute
	 */
	public boolean isSetLabel() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().find_attribute_user(LABEL$8) != null;
		}
	}

	/**
	 * Sets the "label" attribute
	 */
	public void setLabel(java.lang.String label) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(LABEL$8);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(LABEL$8);
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
			target = (org.apache.xmlbeans.XmlString) get_store().find_attribute_user(LABEL$8);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_attribute_user(LABEL$8);
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
			get_store().remove_attribute(LABEL$8);
		}
	}
}
