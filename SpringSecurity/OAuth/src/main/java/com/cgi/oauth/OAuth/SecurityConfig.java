package com.cgi.oauth.OAuth;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/public").permitAll() // No authentication required
                .anyRequest().authenticated() // Requires authentication for all other requests
            )
            .oauth2Login(); // Enables OAuth2 login via GitHub
        return http.build();
    }
}

@RestController
class UserController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint";
    }

    @GetMapping("/private")
    public String privateEndpoint(OAuth2AuthenticationToken authenticationToken) {
        // Check if authenticationToken is not null before accessing its attributes
        if (authenticationToken == null) {
            return "No authentication token available";
        }
        System.out.println(authenticationToken.getPrincipal().getAttributes());
        return "Hello, " + authenticationToken.getPrincipal().getAttributes().get("login") + "! This is a protected endpoint.";
    }
}