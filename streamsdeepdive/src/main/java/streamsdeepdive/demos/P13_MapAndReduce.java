package streamsdeepdive.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;
import streamsdeepdive.dataclasses.PersonDTO;

public class P13_MapAndReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		transformationWithMap();
		
//		transformationWithMapV2();
		
		reduceDemo();
	}

	public static Predicate<Person> ageMoreThan20 = person -> person.getAge() > 20;
	
	public static void transformationWithMap() {
		List<Person> people = GenerateData.getPeople();
		
		Function<Person, PersonDTO> personToPersonDTOFunction = 
				person -> new PersonDTO(
						person.getId(), 
						person.getName(), 
						person.getAge());
				
		List<PersonDTO> personDTOs = 
				people.stream()
				.filter(ageMoreThan20)
				.map(personToPersonDTOFunction)
				.collect(Collectors.toList());
		
		personDTOs.forEach(System.out::println);
	}
	
	public static void transformationWithMapV2() {
		List<Person> people = GenerateData.getPeople();
		
		List<PersonDTO> personDTOs = 
				people.stream()
				.filter(ageMoreThan20)
				.map(PersonDTO::map)
				.collect(Collectors.toList());
		
		personDTOs.forEach(System.out::println);
	}
	
	public static void reduceDemo() {
		int[] integers = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(integers)
				.reduce(0, Integer::sum);
		
		System.out.println("Sum of values: " + sum);
		
		int prod = Arrays.stream(integers)
				.reduce(1, (a, b) -> a * b);
		
//		(1, 1) -> 1*1 => 1
//		(1, 2) -> 1*2 => 2
//		(2, 3) -> 2*3 => 6
//		(6, 4) -> 6*4 => 24
//		(24, 5) -> 24*5 => 120
		
		System.out.println("Product of values: " + prod);
		
		int sub = Arrays.stream(integers)
				.reduce(0, (a, b) -> a - b);
		
		System.out.println("Subtraction of values: " + sub);
		
		Double division = Arrays.stream(integers)
//				.mapToDouble(n -> new Double(n))
				.mapToDouble(Double::new)
				.reduce(1.0, (a, b) -> a / b);
		
		System.out.println("division: " + division);
				
				
	}
}
