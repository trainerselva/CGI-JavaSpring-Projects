package com.cgi.springCoreDemo.service;

public class MessageService {
	private String message;

	// Constructor that takes a message as an argument
	public MessageService(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("MessageService Message: " + message);
	}
	
}
