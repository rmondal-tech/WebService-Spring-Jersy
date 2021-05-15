package com.java.spring.jersey.error;

public class PersonDataNotFoundCustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PersonDataNotFoundCustomException(String exceptionMsg)
	{
		super(exceptionMsg);
	}
	
}