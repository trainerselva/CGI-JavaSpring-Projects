package com.selva;

//public class BetterStack {
//	public void pushData(int data) {
//		System.out.println("BetterStack::pushData called with data " + data);
//	}
//	
//	public int popData() {
//		System.out.println("BetterStack::popData called");
//		return 10;
//	}
//}

public class BetterStack implements StackOps {

	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		System.out.println("BetterStack::push called with data " + data);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		System.out.println("BetterStack::pop called");
		return 10;
	}
	
}