package com.cgi.springCoreDemo.service;

public class Student {
	private String name;
	private String city;
	private float cgpa;
	
	// Constructor
	public Student(String name, String city, float cgpa) {
		System.out.println("Student constructor called");
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	
	
}
