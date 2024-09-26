package com.cgi.SpringSecurityOauthGithub_02_ResourceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/api/resource")
    public String getResource() {
        return "Protected Resource accessed";
    }
}