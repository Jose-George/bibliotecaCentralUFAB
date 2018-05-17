package br.edu.ufab.service.exception;

public class NotFoundItemException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NotFoundItemException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
