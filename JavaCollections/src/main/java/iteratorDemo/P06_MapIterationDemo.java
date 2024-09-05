package iteratorDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P06_MapIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a map of student-name and cgpa pairs
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("First", 7.8);
		map.put("Second", 9.6);
		map.put("Third", 8.5);
		map.put("Fourth", 7.7);
		
		System.out.println("Original map: " + map);
		
		//////////////////
		// Iterating over the keys
		
		// Obtain an iterator for the set of keys
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		
		// Iterate over the keys
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
		/////////////////////////////////////////
		// Iterating over the values
		
		// Obtain an iterator for the collection of values
		Collection<Double> values = map.values();
		Iterator<Double> valueIterator = values.iterator();
		
		// Iterate over the values
		while (valueIterator.hasNext()) {
			Double value = valueIterator.next();
			System.out.println("Value: " + value);
		}
		
		
		////////////////////////////////////////////////
		// Iterating over the entries in the map
		
		// Obtain an iterator for the set of entries
		Set<Entry<String, Double>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Double>> entryIterator = entryset.iterator();
		
		// Iterate over the entries
		while (entryIterator.hasNext()) {
			Map.Entry<String, Double> entry = entryIterator.next();
			System.out.println("Entry: " + entry);
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
