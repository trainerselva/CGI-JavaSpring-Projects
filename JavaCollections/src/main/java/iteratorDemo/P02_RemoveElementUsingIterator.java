package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P02_RemoveElementUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of numbers
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		// Print the original list
		System.out.println("Original list: " + numbers);
		
		// Obtain an iterator for the list
		Iterator<Integer> iterator = numbers.iterator();
		
		// Iterate and remove elements conditionally
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			if (number < 30) {
				iterator.remove(); // Safely remove the element
			}
		}
		
		// The iterator checks each element, and if the element is 
		//		less than 30, it removes it from the list
		
		// The remove() method ensures that the element is removed without
		//		causing a ConcurrentModificationException
		
		// Print the modified list
		System.out.println("Modified list: " + numbers);
		
	}

}
