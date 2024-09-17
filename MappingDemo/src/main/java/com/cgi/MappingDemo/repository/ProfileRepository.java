package com.cgi.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.MappingDemo.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
