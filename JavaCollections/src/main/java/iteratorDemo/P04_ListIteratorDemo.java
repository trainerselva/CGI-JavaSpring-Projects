package iteratorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P04_ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of names
		List<String> names = new ArrayList<String>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		
		// Obtain a ListIterator for the list
		ListIterator<String> listIterator = names.listIterator();
		
		// Forward iteration
		System.out.println("Forward iteration");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		// Backward iteration
		System.out.println("Backward iteration");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("Original list: " + names);
		while (listIterator.hasNext()) {
			String name = listIterator.next();
			if (name.equals("Second")) {
				listIterator.set("Tenth");
			}
		}
		
		System.out.println("Modified list: " + names);
	}

}
