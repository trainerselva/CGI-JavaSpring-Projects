package com.cgi;

import java.util.ArrayList;

public class P02_WithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Hello");
//		list.add(123); // Compile time error
		
		String str = list.get(0); // No cast needed
		System.out.println(str);
	}

}
