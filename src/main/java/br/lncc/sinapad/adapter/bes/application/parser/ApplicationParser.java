package br.lncc.sinapad.adapter.bes.application.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlException;

import br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig;
import br.lncc.sinapad.adapter.bes.application.xml.element.File;
import br.lncc.sinapad.adapter.bes.application.xml.element.Group;
import br.lncc.sinapad.core.application.representation.Representation;

public class ApplicationParser {

	public static Representation fromApplicationConfigToRepresentation(InputStream config) {
		Representation rep = new Representation();
		for (br.lncc.sinapad.adapter.bes.application.xml.element.Group g : parse(config).getGroupArray()) {
			rep.addGroup(convertGroup(g));
		}
		return rep;
	}

	private static String classpath;
	private static String executable;
	private static String vm;
	private static Boolean compss;
	private static String wallclocktime;
	private static String app_location;
	private static List<File> stagein = new ArrayList<>();
	private static List<File> stageout = new ArrayList<>();
	private static int cores;
	private static Double memory;
	private static Double size;
	private static String file_deploy_path;
	private static String app_deploy_path;

	public static String getWallClockTime() {
		return wallclocktime;
	}

	public static String getClassPath() {
		return classpath;
	}

	public static String getExecutable() {
		return executable;
	}

	public static String getVm() {
		return vm;
	}

	public static Boolean isCompssApplication() {
		return compss;
	}

	public static AppConfig parse(InputStream config) {
		br.lncc.sinapad.adapter.bes.application.xml.element.AppConfigDocument app_config;
		try {
			app_config = br.lncc.sinapad.adapter.bes.application.xml.element.AppConfigDocument.Factory.parse(config);
			br.lncc.sinapad.adapter.bes.application.xml.element.AppConfig ac = app_config.getAppConfig();
			classpath = ac.getClasspath();
			executable = ac.getExecutable();
			vm = ac.getVmParameters().getVm();
			compss = ac.getCompss();
			for (Group g : ac.getGroupArray()) {
				for (File f : g.getFileArray()) {
					if (f.getStage().equals(File.Stage.IN)) {
						stagein.add(f);
					} else {
						stageout.add(f);
					}
				}
			}
			setSize(ac.getVmParameters().getSize());
			setMemory(ac.getVmParameters().getMemory());
			setCores(ac.getVmParameters().getCores());
			app_location = ac.getAppLocation();
			file_deploy_path = ac.getPmesDeployPath();
			app_deploy_path = ac.getPmesAppDeployPath();
			return app_config.getAppConfig();
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static br.lncc.sinapad.core.application.representation.Group convertGroup(br.lncc.sinapad.adapter.bes.application.xml.element.Group group) {
		br.lncc.sinapad.core.application.representation.Group nGroup = new br.lncc.sinapad.core.application.representation.Group();
		nGroup.setLabel(group.getLabel());
		for (br.lncc.sinapad.adapter.bes.application.xml.element.File f : group.getFileArray()) {
			nGroup.addParameter(ApplicationParameterFactory.createParameter(f));
			if (f.getStage().equals("IN")) {
				getStagein().add(f);
			} else {
				getStageout().add(f);
			}
		}
		for (br.lncc.sinapad.adapter.bes.application.xml.element.Integer i : group.getIntegerArray()) {
			nGroup.addParameter(ApplicationParameterFactory.createParameter(i));
		}
		for (br.lncc.sinapad.adapter.bes.application.xml.element.Double d : group.getDoubleArray()) {
			nGroup.addParameter(ApplicationParameterFactory.createParameter(d));
		}
		for (br.lncc.sinapad.adapter.bes.application.xml.element.String s : group.getStringArray()) {
			nGroup.addParameter(ApplicationParameterFactory.createParameter(s));
		}
		return nGroup;
	}

	public static List<br.lncc.sinapad.adapter.bes.application.xml.element.File> getStagein() {
		return stagein;
	}

	public static void setStagein(List<br.lncc.sinapad.adapter.bes.application.xml.element.File> stagein) {
		ApplicationParser.stagein = stagein;
	}

	public static List<br.lncc.sinapad.adapter.bes.application.xml.element.File> getStageout() {
		return stageout;
	}

	public static void setStageout(List<br.lncc.sinapad.adapter.bes.application.xml.element.File> stageout) {
		ApplicationParser.stageout = stageout;
	}

	public static String getApp_location() {
		return app_location;
	}

	public static void setApp_location(String app_location) {
		ApplicationParser.app_location = app_location;
	}

	public static int getCores() {
		return cores;
	}

	public static void setCores(int cores) {
		ApplicationParser.cores = cores;
	}

	public static Double getMemory() {
		return memory;
	}

	public static void setMemory(Double memory) {
		ApplicationParser.memory = memory;
	}

	public static Double getSize() {
		return size;
	}

	public static void setSize(Double size) {
		ApplicationParser.size = size;
	}

	public static String getFile_deploy_path() {
		return file_deploy_path;
	}

	public static void setFile_deploy_path(String file_deploy_path) {
		ApplicationParser.file_deploy_path = file_deploy_path;
	}

	public static String getApp_deploy_path() {
		return app_deploy_path;
	}

	public static void setApp_deploy_path(String app_deploy_path) {
		ApplicationParser.app_deploy_path = app_deploy_path;
	}

}
