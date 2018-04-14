package com.mateus.spring.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * serialVersionUID para ObjectNotFoundException
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
