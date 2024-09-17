package com.cgi.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.MappingDemo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
