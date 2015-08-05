package br.lncc.sinapad.adapter.bes.application.converter;

import java.io.InputStream;
import java.util.Properties;

import br.lncc.sinapad.adapter.bes.application.parser.ApplicationParser;
import br.lncc.sinapad.core.application.representation.Representation;
import br.lncc.sinapad.core.exception.ApplicationConverterException;
import br.lncc.sinapad.core.service.application.converter.ApplicationConverterService;

public class BESApplicationConverterService implements ApplicationConverterService {

	@Override
	public Representation convert(InputStream config, Properties locale) throws ApplicationConverterException {
		return ApplicationParser.fromApplicationConfigToRepresentation(config);
	}

}
