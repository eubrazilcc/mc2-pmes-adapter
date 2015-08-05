package br.lncc.sinapad.adapter.bes.application.parser;

import br.lncc.sinapad.core.application.representation.element.InputFile;
import br.lncc.sinapad.core.application.representation.element.OutputFile;
import br.lncc.sinapad.core.application.representation.element.Text;
import br.lncc.sinapad.core.application.representation.element.TextDouble;
import br.lncc.sinapad.core.application.representation.element.TextInteger;

public abstract class ApplicationParameterFactory {

	public static br.lncc.sinapad.core.application.representation.Parameter createParameter(Object parameter) {

		if (parameter instanceof br.lncc.sinapad.adapter.bes.application.xml.element.Integer) {
			br.lncc.sinapad.adapter.bes.application.xml.element.Integer i = (br.lncc.sinapad.adapter.bes.application.xml.element.Integer) parameter;

			TextInteger element = new TextInteger();
			element.setName(i.getName());
			element.setLabel(i.getLabel());
			element.setTip(i.getTip());
			Integer value = i.getValue().intValue();
			if (value != null) {
				element.setValue(String.valueOf(value));
			}
			return element;
		} else if (parameter instanceof br.lncc.sinapad.adapter.bes.application.xml.element.File) {
			br.lncc.sinapad.adapter.bes.application.xml.element.File p = (br.lncc.sinapad.adapter.bes.application.xml.element.File) parameter;

			// br.lncc.sinapad.core.application.representation.element NOT IMPLEMENTED
			if (p.getStage().equals(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.IN)) {
				InputFile element = new InputFile();
				element.setName(p.getName());
				element.setLabel(p.getLabel());
				element.setTip(p.getTip());
				// VERIFY p.getCategory null
				if (p.getCategory() != null && p.getCategory().equals(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.DIRECTORY)) {
					element.setCategory(br.lncc.sinapad.core.application.representation.element.File.Category.DIR);
				} else {
					element.setCategory(br.lncc.sinapad.core.application.representation.element.File.Category.FILE);
				}
				if (!p.getValue().isEmpty() && !p.isNil()) {
					element.setValue(p.getValue());
				}
				return element;
			} else if (p.getStage().equals(br.lncc.sinapad.adapter.bes.application.xml.element.File.Stage.OUT)) {
				OutputFile element = new OutputFile();
				element.setName(p.getName());
				element.setLabel(p.getLabel());
				element.setTip(p.getTip());

				if (p.getCategory().equals(br.lncc.sinapad.adapter.bes.application.xml.element.File.Category.DIRECTORY)) {
					element.setCategory(br.lncc.sinapad.core.application.representation.element.File.Category.DIR);
				} else {
					element.setCategory(br.lncc.sinapad.core.application.representation.element.File.Category.FILE);
				}
				if (!p.getValue().isEmpty() || !p.isNil()) {
					element.setValue(p.getValue());
				}
				return element;
			}
		} else if (parameter instanceof br.lncc.sinapad.adapter.bes.application.xml.element.Double) {
			br.lncc.sinapad.adapter.bes.application.xml.element.Double i = (br.lncc.sinapad.adapter.bes.application.xml.element.Double) parameter;
			TextDouble element = new TextDouble();
			element.setName(i.getName());
			element.setLabel(i.getLabel());
			element.setTip(i.getTip());
			Double value = i.getValue();
			if (value != null) {
				element.setValue(String.valueOf(value));
			}
			return element;
		} else if (parameter instanceof br.lncc.sinapad.adapter.bes.application.xml.element.String) {
			br.lncc.sinapad.adapter.bes.application.xml.element.String s = (br.lncc.sinapad.adapter.bes.application.xml.element.String) parameter;
			Text element = new Text();
			element.setName(s.getName());
			element.setLabel(s.getLabel());
			if (s.getValue() != null) {
				element.setValue(s.getValue());
			}
			return element;
		}
		throw new RuntimeException("Could not parse the Parameter type: [" + parameter.getClass().getCanonicalName() + "]");
	}
}
