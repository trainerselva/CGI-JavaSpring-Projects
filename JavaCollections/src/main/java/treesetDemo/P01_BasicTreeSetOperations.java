package treesetDemo;

import java.util.TreeSet;

public class P01_BasicTreeSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a TreeSet of integers
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		// Add elements to the TreeSet
		numbers.add(10);
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		
		// Print the TreeSet
		System.out.println("Original treeset: " + numbers);
		
		// Check if an element exists
		boolean containsTen = numbers.contains(10);
		System.out.println("Contains 10: " + containsTen);
		
		// Remove an element
		numbers.remove(15);
		System.out.println("After removal: " + numbers);
		
		// Get the first and last elements
		int first = numbers.first();
		int last = numbers.last();
		System.out.println("First: " + first + ", Last: " + last);
		
	}

}
