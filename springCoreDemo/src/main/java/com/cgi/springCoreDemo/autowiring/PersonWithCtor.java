package com.cgi.springCoreDemo.autowiring;

public class PersonWithCtor {
	private String name;
	private int age;
	private Address address; 
	
	
	// Constructor
	public PersonWithCtor(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
	
}
