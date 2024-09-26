package com.cgi.SpringSecurityMicroserviceDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello from the public API!";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Hello from the private (secured) API!";
    }
}