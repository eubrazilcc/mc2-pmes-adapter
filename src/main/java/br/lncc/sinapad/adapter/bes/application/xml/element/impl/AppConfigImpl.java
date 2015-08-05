/*
 * XML Type: app-config Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * An XML
 * app-config(@http://lncc.br/sinapad/adapter/bes/application/xml/element/).
 *
 * This is a complex type.
 */
public class AppConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig {
	private static final long serialVersionUID = 1L;

	public AppConfigImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName WALLCLOCKTIME$0 = new javax.xml.namespace.QName("", "wallclocktime");
	private static final javax.xml.namespace.QName CLASSPATH$2 = new javax.xml.namespace.QName("", "classpath");
	private static final javax.xml.namespace.QName EXECUTABLE$4 = new javax.xml.namespace.QName("", "executable");
	private static final javax.xml.namespace.QName GROUP$6 = new javax.xml.namespace.QName("", "group");
	private static final javax.xml.namespace.QName COMPSS$8 = new javax.xml.namespace.QName("", "compss");
	private static final javax.xml.namespace.QName VMPARAMETERS$10 = new javax.xml.namespace.QName("", "vm-parameters");
	private static final javax.xml.namespace.QName APPLOCATION$12 = new javax.xml.namespace.QName("", "app-location");
	private static final javax.xml.namespace.QName PMESDEPLOYPATH$14 = new javax.xml.namespace.QName("", "pmes-deploy-path");
	private static final javax.xml.namespace.QName PMESAPPDEPLOYPATH$16 = new javax.xml.namespace.QName("", "pmes-app-deploy-path");

	/**
	 * Gets the "wallclocktime" element
	 */
	public int getWallclocktime() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WALLCLOCKTIME$0, 0);
			if (target == null) {
				return 0;
			}
			return target.getIntValue();
		}
	}

	/**
	 * Gets (as xml) the "wallclocktime" element
	 */
	public org.apache.xmlbeans.XmlInt xgetWallclocktime() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInt target = null;
			target = (org.apache.xmlbeans.XmlInt) get_store().find_element_user(WALLCLOCKTIME$0, 0);
			return target;
		}
	}

	/**
	 * True if has "wallclocktime" element
	 */
	public boolean isSetWallclocktime() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(WALLCLOCKTIME$0) != 0;
		}
	}

	/**
	 * Sets the "wallclocktime" element
	 */
	public void setWallclocktime(int wallclocktime) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WALLCLOCKTIME$0, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(WALLCLOCKTIME$0);
			}
			target.setIntValue(wallclocktime);
		}
	}

	/**
	 * Sets (as xml) the "wallclocktime" element
	 */
	public void xsetWallclocktime(org.apache.xmlbeans.XmlInt wallclocktime) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlInt target = null;
			target = (org.apache.xmlbeans.XmlInt) get_store().find_element_user(WALLCLOCKTIME$0, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlInt) get_store().add_element_user(WALLCLOCKTIME$0);
			}
			target.set(wallclocktime);
		}
	}

	/**
	 * Unsets the "wallclocktime" element
	 */
	public void unsetWallclocktime() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(WALLCLOCKTIME$0, 0);
		}
	}

	/**
	 * Gets the "classpath" element
	 */
	public java.lang.String getClasspath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CLASSPATH$2, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "classpath" element
	 */
	public org.apache.xmlbeans.XmlString xgetClasspath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CLASSPATH$2, 0);
			return target;
		}
	}

	/**
	 * True if has "classpath" element
	 */
	public boolean isSetClasspath() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(CLASSPATH$2) != 0;
		}
	}

	/**
	 * Sets the "classpath" element
	 */
	public void setClasspath(java.lang.String classpath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CLASSPATH$2, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CLASSPATH$2);
			}
			target.setStringValue(classpath);
		}
	}

	/**
	 * Sets (as xml) the "classpath" element
	 */
	public void xsetClasspath(org.apache.xmlbeans.XmlString classpath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CLASSPATH$2, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(CLASSPATH$2);
			}
			target.set(classpath);
		}
	}

	/**
	 * Unsets the "classpath" element
	 */
	public void unsetClasspath() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(CLASSPATH$2, 0);
		}
	}

	/**
	 * Gets the "executable" element
	 */
	public java.lang.String getExecutable() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(EXECUTABLE$4, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "executable" element
	 */
	public org.apache.xmlbeans.XmlString xgetExecutable() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(EXECUTABLE$4, 0);
			return target;
		}
	}

	/**
	 * True if has "executable" element
	 */
	public boolean isSetExecutable() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(EXECUTABLE$4) != 0;
		}
	}

	/**
	 * Sets the "executable" element
	 */
	public void setExecutable(java.lang.String executable) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(EXECUTABLE$4, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(EXECUTABLE$4);
			}
			target.setStringValue(executable);
		}
	}

	/**
	 * Sets (as xml) the "executable" element
	 */
	public void xsetExecutable(org.apache.xmlbeans.XmlString executable) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(EXECUTABLE$4, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(EXECUTABLE$4);
			}
			target.set(executable);
		}
	}

	/**
	 * Unsets the "executable" element
	 */
	public void unsetExecutable() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(EXECUTABLE$4, 0);
		}
	}

	/**
	 * Gets array of all "group" elements
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Group[] getGroupArray() {
		synchronized (monitor()) {
			check_orphaned();
			java.util.List targetList = new java.util.ArrayList();
			get_store().find_all_element_users(GROUP$6, targetList);
			br.lncc.sinapad.adapter.bes.application.xml.element.Group[] result = new br.lncc.sinapad.adapter.bes.application.xml.element.Group[targetList.size()];
			targetList.toArray(result);
			return result;
		}
	}

	/**
	 * Gets ith "group" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Group getGroupArray(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Group target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Group) get_store().find_element_user(GROUP$6, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			return target;
		}
	}

	/**
	 * Returns number of "group" element
	 */
	public int sizeOfGroupArray() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(GROUP$6);
		}
	}

	/**
	 * Sets array of all "group" element WARNING: This method is not atomicaly
	 * synchronized.
	 */
	public void setGroupArray(br.lncc.sinapad.adapter.bes.application.xml.element.Group[] groupArray) {
		check_orphaned();
		arraySetterHelper(groupArray, GROUP$6);
	}

	/**
	 * Sets ith "group" element
	 */
	public void setGroupArray(int i, br.lncc.sinapad.adapter.bes.application.xml.element.Group group) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Group target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Group) get_store().find_element_user(GROUP$6, i);
			if (target == null) {
				throw new IndexOutOfBoundsException();
			}
			target.set(group);
		}
	}

	/**
	 * Inserts and returns a new empty value (as xml) as the ith "group" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Group insertNewGroup(int i) {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Group target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Group) get_store().insert_element_user(GROUP$6, i);
			return target;
		}
	}

	/**
	 * Appends and returns a new empty value (as xml) as the last "group" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.Group addNewGroup() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.Group target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.Group) get_store().add_element_user(GROUP$6);
			return target;
		}
	}

	/**
	 * Removes the ith "group" element
	 */
	public void removeGroup(int i) {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(GROUP$6, i);
		}
	}

	/**
	 * Gets the "compss" element
	 */
	public boolean getCompss() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COMPSS$8, 0);
			if (target == null) {
				return false;
			}
			return target.getBooleanValue();
		}
	}

	/**
	 * Gets (as xml) the "compss" element
	 */
	public org.apache.xmlbeans.XmlBoolean xgetCompss() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlBoolean target = null;
			target = (org.apache.xmlbeans.XmlBoolean) get_store().find_element_user(COMPSS$8, 0);
			return target;
		}
	}

	/**
	 * True if has "compss" element
	 */
	public boolean isSetCompss() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(COMPSS$8) != 0;
		}
	}

	/**
	 * Sets the "compss" element
	 */
	public void setCompss(boolean compss) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COMPSS$8, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(COMPSS$8);
			}
			target.setBooleanValue(compss);
		}
	}

	/**
	 * Sets (as xml) the "compss" element
	 */
	public void xsetCompss(org.apache.xmlbeans.XmlBoolean compss) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlBoolean target = null;
			target = (org.apache.xmlbeans.XmlBoolean) get_store().find_element_user(COMPSS$8, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlBoolean) get_store().add_element_user(COMPSS$8);
			}
			target.set(compss);
		}
	}

	/**
	 * Unsets the "compss" element
	 */
	public void unsetCompss() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(COMPSS$8, 0);
		}
	}

	/**
	 * Gets the "vm-parameters" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters getVmParameters() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) get_store().find_element_user(VMPARAMETERS$10, 0);
			if (target == null) {
				return null;
			}
			return target;
		}
	}

	/**
	 * True if has "vm-parameters" element
	 */
	public boolean isSetVmParameters() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(VMPARAMETERS$10) != 0;
		}
	}

	/**
	 * Sets the "vm-parameters" element
	 */
	public void setVmParameters(br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters vmParameters) {
		generatedSetterHelperImpl(vmParameters, VMPARAMETERS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
	}

	/**
	 * Appends and returns a new empty "vm-parameters" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters addNewVmParameters() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.VmParameters) get_store().add_element_user(VMPARAMETERS$10);
			return target;
		}
	}

	/**
	 * Unsets the "vm-parameters" element
	 */
	public void unsetVmParameters() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(VMPARAMETERS$10, 0);
		}
	}

	/**
	 * Gets the "app-location" element
	 */
	public java.lang.String getAppLocation() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(APPLOCATION$12, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "app-location" element
	 */
	public org.apache.xmlbeans.XmlString xgetAppLocation() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(APPLOCATION$12, 0);
			return target;
		}
	}

	/**
	 * True if has "app-location" element
	 */
	public boolean isSetAppLocation() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(APPLOCATION$12) != 0;
		}
	}

	/**
	 * Sets the "app-location" element
	 */
	public void setAppLocation(java.lang.String appLocation) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(APPLOCATION$12, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(APPLOCATION$12);
			}
			target.setStringValue(appLocation);
		}
	}

	/**
	 * Sets (as xml) the "app-location" element
	 */
	public void xsetAppLocation(org.apache.xmlbeans.XmlString appLocation) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(APPLOCATION$12, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(APPLOCATION$12);
			}
			target.set(appLocation);
		}
	}

	/**
	 * Unsets the "app-location" element
	 */
	public void unsetAppLocation() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(APPLOCATION$12, 0);
		}
	}

	/**
	 * Gets the "pmes-deploy-path" element
	 */
	public java.lang.String getPmesDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PMESDEPLOYPATH$14, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "pmes-deploy-path" element
	 */
	public org.apache.xmlbeans.XmlString xgetPmesDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PMESDEPLOYPATH$14, 0);
			return target;
		}
	}

	/**
	 * True if has "pmes-deploy-path" element
	 */
	public boolean isSetPmesDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(PMESDEPLOYPATH$14) != 0;
		}
	}

	/**
	 * Sets the "pmes-deploy-path" element
	 */
	public void setPmesDeployPath(java.lang.String pmesDeployPath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PMESDEPLOYPATH$14, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(PMESDEPLOYPATH$14);
			}
			target.setStringValue(pmesDeployPath);
		}
	}

	/**
	 * Sets (as xml) the "pmes-deploy-path" element
	 */
	public void xsetPmesDeployPath(org.apache.xmlbeans.XmlString pmesDeployPath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PMESDEPLOYPATH$14, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(PMESDEPLOYPATH$14);
			}
			target.set(pmesDeployPath);
		}
	}

	/**
	 * Unsets the "pmes-deploy-path" element
	 */
	public void unsetPmesDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(PMESDEPLOYPATH$14, 0);
		}
	}

	/**
	 * Gets the "pmes-app-deploy-path" element
	 */
	public java.lang.String getPmesAppDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PMESAPPDEPLOYPATH$16, 0);
			if (target == null) {
				return null;
			}
			return target.getStringValue();
		}
	}

	/**
	 * Gets (as xml) the "pmes-app-deploy-path" element
	 */
	public org.apache.xmlbeans.XmlString xgetPmesAppDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PMESAPPDEPLOYPATH$16, 0);
			return target;
		}
	}

	/**
	 * True if has "pmes-app-deploy-path" element
	 */
	public boolean isSetPmesAppDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			return get_store().count_elements(PMESAPPDEPLOYPATH$16) != 0;
		}
	}

	/**
	 * Sets the "pmes-app-deploy-path" element
	 */
	public void setPmesAppDeployPath(java.lang.String pmesAppDeployPath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.SimpleValue target = null;
			target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PMESAPPDEPLOYPATH$16, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(PMESAPPDEPLOYPATH$16);
			}
			target.setStringValue(pmesAppDeployPath);
		}
	}

	/**
	 * Sets (as xml) the "pmes-app-deploy-path" element
	 */
	public void xsetPmesAppDeployPath(org.apache.xmlbeans.XmlString pmesAppDeployPath) {
		synchronized (monitor()) {
			check_orphaned();
			org.apache.xmlbeans.XmlString target = null;
			target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PMESAPPDEPLOYPATH$16, 0);
			if (target == null) {
				target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(PMESAPPDEPLOYPATH$16);
			}
			target.set(pmesAppDeployPath);
		}
	}

	/**
	 * Unsets the "pmes-app-deploy-path" element
	 */
	public void unsetPmesAppDeployPath() {
		synchronized (monitor()) {
			check_orphaned();
			get_store().remove_element(PMESAPPDEPLOYPATH$16, 0);
		}
	}
}
