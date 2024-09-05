package treesetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class P03_SubsetsAndRanges {

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
		numbers.add(50);
		
		// Print the TreeSet
		System.out.println("Original treeset: " + numbers);
		
		// Create a subset from 20 (inclusive) to 40 (exclusive)
		SortedSet<Integer> subset = numbers.subSet(20, 40);
		System.out.println("Subset from 20 to 40: " + subset);
		
		// Create a headset (all elements less than 30)
		SortedSet<Integer> headset = numbers.headSet(30);
		System.out.println("HeadSet less than 30: " + headset);
		
		// Create a tailset (all elements greater than or equal to 30
		SortedSet<Integer> tailset = numbers.tailSet(30);
		System.out.println("TailSet 30 and greater: " + tailset);
	}

}
