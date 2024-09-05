package iteratorDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class P05_SetIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a set of integers
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(40);
		numbers.add(20);
		numbers.add(30);
		numbers.add(80);
		
		System.out.println("Original set: " + numbers);
		
		// Obtain an iterator for the set
		Iterator<Integer> iterator = numbers.iterator();
		
		// Iterate over the set
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println("Number: " + number);
		}
	}

}
