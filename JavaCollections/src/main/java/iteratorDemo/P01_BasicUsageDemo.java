package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P01_BasicUsageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of country names
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Russia");
		countries.add("Japan");
		
		// Obtain an iterator for the list
		Iterator<String> iterator = countries.iterator();
		
		// Iterate over the list using the iterator
		
		//   India   Russia   Japan
		//                           ^
		//       India   Russia   Japan
		
		
		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.println("Country: " + country);
		}
		
		// countries.iterator(): Returns an Iterator for the countries list
		// iterator.hasNext(): Checks if there are more elements in the list
		// iterator.next(): Retrieves the next element in the list
		//					and advances the iterator
	}

}
