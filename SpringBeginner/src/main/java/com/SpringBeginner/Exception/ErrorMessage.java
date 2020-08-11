package com.SpringBeginner.Exception;

public class ErrorMessage {

	private int errorcode;
	private String message;
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorMessage() {
		super();
		this.errorcode = errorcode;
		this.message = message;
	}
	
	


	

}
