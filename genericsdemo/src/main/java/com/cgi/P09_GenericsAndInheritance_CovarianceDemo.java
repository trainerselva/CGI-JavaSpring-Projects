package com.cgi;

import java.util.List;

// Wildcards can be used to overcome the limitation of Invariance
// This is called as Covariance

public class P09_GenericsAndInheritance_CovarianceDemo {

	public static void printList(List<? extends Object> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("India", "USA", "UK");
		printList(stringList);
		
//		List<Object> objectList = stringList; // Again invariance will cause
											  // compile-time errors
	}

}
