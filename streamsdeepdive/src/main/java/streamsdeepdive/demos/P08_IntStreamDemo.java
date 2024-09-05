package streamsdeepdive.demos;

import java.util.List;
import java.util.stream.IntStream;

import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;

public class P08_IntStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		rangeDemo();
		
//		rangeIterationOnList();
		
		intStreamIterateDemo();
	}
	
	public static void rangeDemo() {
		System.out.println("Using for loop");
		for (int i = 0; i <= 10; ++i) {
			System.out.println(i);
		}
		
		// IntStream range exclusive
		System.out.println("Int stream exclusive");
		IntStream.range(0, 10).forEach(System.out::println);
		
		// IntStream range inclusive
		System.out.println("Int stream inclusive");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
	}

	// Loop through list of persons using IntStream
	
	public static void rangeIterationOnList() {
		List<Person> people = GenerateData.getPeople();
		IntStream.range(0, people.size())
			.forEach(index -> {
				System.out.println(people.get(index));
			});
	}
	
	// Int stream iterate method demo
	
	public static void intStreamIterateDemo() {
		IntStream.iterate(0, value -> value + 1)
			.limit(11)
			.forEach(System.out::println);
	}
}
