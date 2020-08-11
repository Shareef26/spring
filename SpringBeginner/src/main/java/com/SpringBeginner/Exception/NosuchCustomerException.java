package com.SpringBeginner.Exception;

public class NosuchCustomerException  extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public NosuchCustomerException ( String message) {
		
		super(message);
	}
	
	
public NosuchCustomerException ( ) {
		

	}
	
	
}
