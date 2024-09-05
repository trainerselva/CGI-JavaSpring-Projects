package com.cgi.springCoreDemo.service;

public class Person {
	private String name;
	private int age;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Person setter for name called");
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		System.out.println("Person setter for age called");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
