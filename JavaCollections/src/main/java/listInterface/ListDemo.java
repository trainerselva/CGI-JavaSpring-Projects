package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		
		// Add elements
		names.add("Amitabh");
		names.add("Tom Hanks");
		names.add("Julia Roberts");
		
		System.out.println(names);
		
		// Access elements by index
		System.out.println("First name: " + names.get(0));
		
		// Iterate over elements
		for (String name : names) {
			System.out.println(name);
		}
		
		// Remove an element
		names.remove("Tom Hanks");
		System.out.println("After removal: " + names);
		
		///////////////////////
		// LinkedList
		
		List<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("Nepal");
		System.out.println("Countries: " + countries);
		countries.add(1, "Bhutan");
		System.out.println("After adding Countries: " + countries);
		
		countries.stream().forEach(System.out::println);
		
		/////////////////////////
		// Vector
		
		List<String> vegetables = new Vector<String>();
		vegetables.add("Bottle Gourd");
		vegetables.add("Tomato");
		vegetables.add("Onion");
		System.out.println(vegetables);
		System.out.println(vegetables.contains("Potato"));
		System.out.println(vegetables.contains("Onion"));
		System.out.println(vegetables.size());
		
		
		
	}

}
