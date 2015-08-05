package br.lncc.sinapad.adapter.bes.exception;

@SuppressWarnings("serial")
public class BESConfigurationServiceException extends Exception {
	public BESConfigurationServiceException(String message) {
		super(message);
	}

	public BESConfigurationServiceException(String message, Exception e) {
		super(message, e);
	}
}
