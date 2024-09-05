package com.cgi;

import java.util.List;

public class P06_WildCardDemo {

	public static void printList(List<?> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		List<String> strList = List.of("One", "Two", "Three");
		
		printList(intList);
		printList(strList);
	}

}
