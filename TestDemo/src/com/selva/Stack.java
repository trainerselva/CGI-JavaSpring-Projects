package com.selva;

//public class Stack {
//	public void push(int data) {
//		System.out.println("Stack::push called with data: " + data);
//	}
//	
//	public int pop() {
//		System.out.println("Stack::pop called");
//		return 10;
//	}
//}

public class Stack implements StackOps {

	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		System.out.println("Stack::push called with data: " + data);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		System.out.println("Stack::pop called");
		return 10;
	}
	
}