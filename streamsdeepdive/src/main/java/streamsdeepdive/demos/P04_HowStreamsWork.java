package streamsdeepdive.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;

public class P04_HowStreamsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using collect we can create a collection type of our choice
		// using values from the stream
		
		understandingCollect();
		
		// Stream Operations
		// 1. Intermediate operations
		//		Take some input from the stream and return a stream
		// 2. Terminal operation
		//		Take input from the stream and return something which is not a stream
		
		// Lazy Evaluation - The intermediate operations on the
		//		stream will NOT carried out without a terminal operation
		
		intermediateAndTerminalOperations();
	}

	public static void understandingCollect() {
		List<String> emails = GenerateData.getPeople()
				.stream()
				.map(Person::getEmail)
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
	}
	
	public static void intermediateAndTerminalOperations() {
		System.out.println(
				GenerateData.getCars()
				.stream()
				// intermediate operation
				.filter(car -> {
					System.out.println("Filter car: " + car);
					return car.getPrice() > 3000000;
				})
				// intermediate operation
				.map(car -> {
					System.out.println("Mapping car: " + car);
					return car.getPrice();
				})
				// intermediate operation
				.map(price -> {
					System.out.println("Mapping price: " + price);
					return price + (price * 0.1);
				})
				// terminal operation
				.collect(Collectors.toList())
		);
	}

}
