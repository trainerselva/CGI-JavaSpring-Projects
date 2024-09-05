package mapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> namesAndAges = new HashMap<String, Integer>();
		
		// Add elements
		namesAndAges.put("Ananya", 25);
		namesAndAges.put("Rakesh", 22);
		namesAndAges.put("Deepak", 24);
		namesAndAges.put("Aisha", 22);
		
		System.out.println("Names and ages: " + namesAndAges);
		
		// Access elements
		System.out.println("Deepak age is: " + namesAndAges.get("Deepak"));
		
		// Iterate over elements
		for (Map.Entry<String, Integer> entry : namesAndAges.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		///////////////////////////////
		// LinkedHashMap
		
		Map<String, Double> products = new LinkedHashMap<String, Double>();
		
		products.put("Pencil", 12.5);
		products.put("Chart Paper", 5.0);
		products.put("Eraser", 2.5);
		products.put("Scale", 10.3);
		
		System.out.println("Products map: " + products);
		
		System.out.println("Price of Eraser is: " + products.get("Eraser"));
		
		for (Map.Entry<String, Double> productEntry : products.entrySet()) {
			System.out.println("Name: " + productEntry.getKey()
					 + " Price: " + productEntry.getValue()
					);
		}
		
		///////////////////////////////
		// TreeMap
		
		Comparator<Integer> descending = (a, b) -> {
			if (a < b) return 1;
			if (a > b) return -1;
			return 0;
		};
		
		Comparator<Integer> descending2 = 
				(a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0;
				
		Comparator descending3 =
				Comparator.naturalOrder().reversed();
		
		Map<Integer, String> numbers = new TreeMap<Integer, String>(descending3);
		
		numbers.put(5, "Five");
		numbers.put(1, "One");
		numbers.put(8, "Eight");
		numbers.put(2, "Two");
		
		System.out.println("Numbers: " + numbers);
		
	}

}
