package com.cgi.SpringSecurityDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {

	@Id
	private String name; // e.g. ROLE_USER, ROLE_ADMIN

	public Role() {
		
	}

	public Role(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
