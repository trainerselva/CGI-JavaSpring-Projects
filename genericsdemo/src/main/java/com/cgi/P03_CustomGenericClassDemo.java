package com.cgi;

class Box<T> {
	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return this.data;
	}
}

public class P03_CustomGenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> integerBox = new Box<>();
		integerBox.set(123);
		System.out.println("Integer value: " + integerBox.get());
		
		Box<String> stringBox = new Box<>();
		stringBox.set("Welcome to Generics");
		System.out.println("String value: " + stringBox.get());
	}

}
