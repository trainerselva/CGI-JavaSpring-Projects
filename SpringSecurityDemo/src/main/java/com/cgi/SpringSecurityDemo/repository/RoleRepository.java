package com.cgi.SpringSecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.SpringSecurityDemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
