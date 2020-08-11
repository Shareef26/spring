package com.SpringBeginner.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class ExceptionHandle {

	
	@ExceptionHandler(Exception.class)
	public String  exceptionHandler(Exception ex) {
		 
		return  ex.getMessage();
	}
	
	@ExceptionHandler(NosuchCustomerException.class)
	public ResponseEntity<ErrorMessage> exceptionHandler1(NosuchCustomerException ex){
		
		ErrorMessage errormessage=new ErrorMessage();
		errormessage.setMessage(ex.getMessage());
		errormessage.setErrorcode(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ErrorMessage>(errormessage, HttpStatus.OK);
		
		
		
		
	}
	
	
	
}
