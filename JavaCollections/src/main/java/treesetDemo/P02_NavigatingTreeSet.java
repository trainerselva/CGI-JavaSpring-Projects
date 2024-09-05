package treesetDemo;

import java.util.TreeSet;

public class P02_NavigatingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a TreeSet of integers
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		// Add elements to the TreeSet
		numbers.add(10);
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(25);
		
		// Print the TreeSet
		System.out.println("Original treeset: " + numbers);
		
		// Find the smallest element greater than or equal to 25
		Integer ceiling = numbers.ceiling(25);
		System.out.println("Ceiling of 25: " + ceiling);
		
		// Find the greatest element less than or equal to 25
		Integer floor = numbers.floor(25);
		System.out.println("Floor of 25: " + floor);
		
		// Find the smallest element strictly greater than 25
		Integer higher = numbers.higher(25);
		System.out.println("Higher than 25: " + higher);
		
		// Find the greatest element strictly less than 25
		Integer lower = numbers.lower(25);
		System.out.println("Lower than 25: " + lower);
		
	}

}
