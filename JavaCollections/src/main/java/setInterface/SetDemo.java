package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> fruits = new HashSet<>();
		
		// Add elements
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Apricot");
		fruits.add("Pineapple");
		fruits.add("Banana");
		fruits.add("Apple");
		
		// Iterate over elements
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		Set<String> fruits2 = new LinkedHashSet<String>();
		
		// Add elements
		
		fruits2.add("Banana");
		fruits2.add("Apple");
		fruits2.add("Apricot");
		fruits2.add("Pineapple");
		fruits2.add("Banana");
		fruits2.add("Apple");
		
		// Iterate over elements
		System.out.println("===== LinkedHashSet ========");
		for (String fruit : fruits2) {
			System.out.println(fruit);
		}

		
		Set<String> fruits3 = new TreeSet<String>();
		
		// Add elements
		
		fruits3.add("Banana");
		fruits3.add("Apple");
		fruits3.add("Apricot");
		fruits3.add("Pineapple");
		fruits3.add("Banana");
		fruits3.add("Apple");
		
		// Iterate over elements
		System.out.println("===== TreeSet ========");
		for (String fruit : fruits3) {
			System.out.println(fruit);
		}

	}

}

