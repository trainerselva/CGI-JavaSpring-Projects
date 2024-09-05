package com.cgi;

import java.util.ArrayList;

public class P01_WithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(123); // This will compile, but it can cause runtime errors
		
		String str = (String) list.get(0); // This cast is necessary
		System.out.println(str);
		
		int n = (int) list.get(1);
		System.out.println(n);
	}

}
