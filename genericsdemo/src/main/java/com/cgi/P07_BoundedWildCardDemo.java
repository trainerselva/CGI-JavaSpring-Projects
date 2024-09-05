package com.cgi;

import java.util.List;

public class P07_BoundedWildCardDemo {
	
	public static double sumOfList(List<? extends Number> list) {
		double sum = 0.0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = List.of(1, 2, 3, 4);
		System.out.println("Sum of intList values: " + sumOfList(intList));
		
		List<Double> doubleList = List.of(1.2, 2.3, 3.4);
		System.out.println("Sum of doubleList values: " + sumOfList(doubleList));
	}

}
