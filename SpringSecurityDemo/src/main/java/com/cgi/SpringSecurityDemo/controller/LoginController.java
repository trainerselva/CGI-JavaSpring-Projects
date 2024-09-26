package com.cgi.SpringSecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Show custom login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Home page after login
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
