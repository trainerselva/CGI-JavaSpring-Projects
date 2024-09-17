package com.cgi.__microServiceCommunication_ServiceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/a")
public class MicroserviceAController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Microservice A!";
	}

}
