package br.edu.ufab.service.exception;

public class DuplicateItemException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DuplicateItemException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
}
