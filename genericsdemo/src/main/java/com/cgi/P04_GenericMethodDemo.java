package com.cgi;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		
}

public class P04_GenericMethodDemo {
	
	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {10, 20, 30, 40, 50};
		String[] strArray = {"First", "Second", "Third", "Fourth"};
		Person[] personArray = {
				new Person("Person-1", 25),
				new Person("Person-2", 10),
				new Person("Person-3", 30)
		};
		
		printArray(intArray);
		printArray(strArray);
		printArray(personArray);
	}

}
