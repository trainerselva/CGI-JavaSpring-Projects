package com.cgi.SpringSecurityDemo.config;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cgi.SpringSecurityDemo.model.Role;
import com.cgi.SpringSecurityDemo.model.User;
import com.cgi.SpringSecurityDemo.repository.RoleRepository;
import com.cgi.SpringSecurityDemo.repository.UserRepository;

@Configuration
public class InitialDataLoader {

    @Bean
    public CommandLineRunner loadData(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Create roles if not exist
            if (!roleRepository.existsById("ROLE_USER")) {
                roleRepository.save(new Role("ROLE_USER"));
            }
            if (!roleRepository.existsById("ROLE_ADMIN")) {
                roleRepository.save(new Role("ROLE_ADMIN"));
            }

            // Create admin user if not exist
            if (!userRepository.findByUsername("admin").isPresent()) {
                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setEnabled(true);
                admin.setRoles(Set.of(roleRepository.findById("ROLE_ADMIN").get(),
                                       roleRepository.findById("ROLE_USER").get()));
                userRepository.save(admin);
            }
        };
    }

}
