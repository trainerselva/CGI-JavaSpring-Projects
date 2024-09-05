package com.cgi.springCoreDemo.service;

public class GreetingService {
	private String message;

	// Setter method for dependency injection
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void greet() {
		System.out.println("Message: " + message);
	}
}
