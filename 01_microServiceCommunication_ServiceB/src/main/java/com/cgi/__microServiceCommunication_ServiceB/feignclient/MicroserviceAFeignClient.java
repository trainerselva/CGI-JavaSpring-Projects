package com.cgi.__microServiceCommunication_ServiceB.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-a")
public interface MicroserviceAFeignClient {
	@GetMapping("/api/a/message")
	String getMessageFromMicroserviceA();
}
