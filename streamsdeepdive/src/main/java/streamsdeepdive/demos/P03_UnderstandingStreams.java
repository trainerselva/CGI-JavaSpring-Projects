package streamsdeepdive.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;

public class P03_UnderstandingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create the stream
		// Get the email
		// Create an ArrayList, add the email, add all the emails in the collect
		
		collectDemo();
		
		// The stream functions are evaluated LAZILY
		lazyDemo();
		
	}

	public static void collectDemo() {
		List<String> emails = GenerateData.getPeople()
				.stream()
				.map(Person::getEmail)
				.collect(
						ArrayList::new,
						ArrayList::add,
						ArrayList::addAll
				);
		emails.forEach(System.out::println);
	}
	
	public static void lazyDemo() {
		System.out.println(
				GenerateData.getCars()
				.stream()
				.filter(car -> {
					System.out.println("Filter car: " + car);
					return car.getPrice() > 3000000;
				})
				.map(car -> {
					System.out.println("Mapping car: " + car);
					return car.getPrice();
				})
				.map(price -> {
					System.out.println("Mapping price: " + price);
					return price + (price * 0.1);
				})
				.collect(Collectors.toList())
		);
	}
}
