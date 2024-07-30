package com.walcorp.paymentapp.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PaymentExceptionHandler {
	
	@ExceptionHandler(value = RuntimeException.class)
	public  ResponseEntity<String> exceptionHandler(RuntimeException e)
	{
		ResponseEntity<String>   test   =  new ResponseEntity<String>(HttpStatusCode.valueOf(500));
		return ResponseEntity.internalServerError().build();
		//return ResponseEntity.badRequest().build();// ("Issue in processing request  "+e.getMessage());
	}
}
