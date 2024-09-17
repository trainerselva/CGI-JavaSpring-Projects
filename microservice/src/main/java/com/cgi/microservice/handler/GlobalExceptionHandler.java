package com.cgi.microservice.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cgi.microservice.exception.CustomerNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	// Handle CustomerNotFoundException
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Map<String, String>> 
		handleCustomerNotFoundException(CustomerNotFoundException ex) {
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("error", "Customer not found");
		response.put("message", ex.getMessage());
		
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.NOT_FOUND);
	}
	
	// Handle generic exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>>
		handleGenericException(Exception ex) {
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("error", "Internal Server Error");
		response.put("message", ex.getMessage());
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
