/*
 * An XML document type. Localname: app-config Namespace:
 * http://lncc.br/sinapad/adapter/bes/application/xml/element/ Java type:
 * br.lncc.sinapad.adapter.bes.application.xml.element.AppConfigDocument
 * 
 * Automatically generated - do not modify.
 */
package br.lncc.sinapad.adapter.bes.application.xml.element.impl;

/**
 * A document containing one
 * app-config(@http://lncc.br/sinapad/adapter/bes/application/xml/element/)
 * element.
 *
 * This is a complex type.
 */
public class AppConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.lncc.sinapad.adapter.bes.application.xml.element.AppConfigDocument {
	private static final long serialVersionUID = 1L;

	public AppConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
		super(sType);
	}

	private static final javax.xml.namespace.QName APPCONFIG$0 = new javax.xml.namespace.QName("http://lncc.br/sinapad/adapter/bes/application/xml/element/", "app-config");

	/**
	 * Gets the "app-config" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig getAppConfig() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) get_store().find_element_user(APPCONFIG$0, 0);
			if (target == null) {
				return null;
			}
			return target;
		}
	}

	/**
	 * Sets the "app-config" element
	 */
	public void setAppConfig(br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig appConfig) {
		generatedSetterHelperImpl(appConfig, APPCONFIG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
	}

	/**
	 * Appends and returns a new empty "app-config" element
	 */
	public br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig addNewAppConfig() {
		synchronized (monitor()) {
			check_orphaned();
			br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig target = null;
			target = (br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig) get_store().add_element_user(APPCONFIG$0);
			return target;
		}
	}
}
