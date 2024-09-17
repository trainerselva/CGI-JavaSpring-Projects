package com.cgi.__microServiceCommunication_ServiceB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.__microServiceCommunication_ServiceB.feignclient.MicroserviceAFeignClient;

@RestController
@RequestMapping("/api/b")
public class MicroserviceBController {

	@Autowired
	private MicroserviceAFeignClient microserviceAFeignClient;
	
	@GetMapping("/fetch-message-from-a")
	public String fetchMessageFromA() {
		return microserviceAFeignClient.getMessageFromMicroserviceA();
	}
}
