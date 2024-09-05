package treesetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class P04_CustomOrderingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a TreeSet with a custom comparator (descending order)
		
		Comparator<Integer> descending = Comparator.reverseOrder();
		
		TreeSet<Integer> numbers = 
				new TreeSet<Integer>(descending);
		
		// Add elements to the TreeSet
		numbers.add(10);
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(25);
		numbers.add(50);
		
		// Print the TreeSet
		System.out.println("Original treeset: " + numbers);
		

	}

}
