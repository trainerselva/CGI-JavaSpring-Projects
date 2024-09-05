package streamsdeepdive.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P14_FlatMapDemo {

	private static List<List<String>> arrayListOfNames = 
			List.of(
					List.of("India", "Japan", "Russia"),
					List.of("Vietnam", "Singapore", "Malaysia"),
					List.of("USA", "Canada")
	);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arrayListOfNames);
		
		System.out.println("Without FlatMap");
		withoutFlatMap();
		
		System.out.println("With FlatMap");
		withFlatMap();
		
		flatMapWithOptionals();
	}
	
	public static void withoutFlatMap() {
		List<String> names = new ArrayList();
		for (List<String> strings : arrayListOfNames) {
			names.addAll(strings);
		}
		System.out.println(names);
	}
	
	public static void withFlatMap() {
		List<String> names = arrayListOfNames.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(names);
	}
	
	public static void flatMapWithOptionals() {
		List<Optional<String>> optionals = List.of(
				Optional.of("One"),
				Optional.of("Two"),
				Optional.of("Three")
				);
		
		List<String> list = optionals.stream()
				.flatMap(Optional::stream)
				.collect(Collectors.toList());
		
		System.out.println("FlatMap list of Optionals: " + list);
	}

}
