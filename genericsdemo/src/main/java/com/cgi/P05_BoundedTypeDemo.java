package com.cgi;

class NumberBox<T extends Number> {
	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return this.data;
	}
	
	public double doubleValue() {
		return this.data.doubleValue();
	}
}

public class P05_BoundedTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.set(10);
		System.out.println("Double value from intBox: " + intBox.doubleValue());
		
		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.set(3.1415);
		System.out.println("Double value from doubleBox: " + doubleBox.doubleValue());
		
//		NumberBox<String> strBox = new NumberBox<>();
	}

}
