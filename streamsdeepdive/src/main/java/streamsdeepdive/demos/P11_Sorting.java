package streamsdeepdive.demos;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.Car;
import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;

public class P11_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sortingStreamOfElements();
		
//		sortingStreamOfElementsReversed();
		
//		sortingStreamOfElements();
		
		topTwoMostExpensiveBlueCars();
	}

	// Sorting a stream of elements
	
	public static void sortingStreamOfElements() {
		List<Person> people = GenerateData.getPeople();
		List<String> sortedNames = people.stream()
				.map(Person::getName)
				.sorted()
				.collect(Collectors.toList());
		sortedNames.forEach(System.out::println);
	}
	
	public static void sortingStreamOfElementsReversed() {
		List<Person> people = GenerateData.getPeople();
		List<String> sortedNamesInReverse = people.stream()
				.map(Person::getName)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		sortedNamesInReverse.forEach(System.out::println);
	}
	
	public static void sortingStreamOfObjects() {
		List<Person> people = GenerateData.getPeople();
		
		Comparator<Person> comparator = Comparator
				.comparing(Person::getEmail)
				.reversed()
				.thenComparing(Person::getName);
		
		List<Person> sortedPeople = people.stream()
				.sorted(comparator)
				.collect(Collectors.toList());
		
		sortedPeople.forEach(System.out::println);
				
	}
	
	public static void topTwoMostExpensiveBlueCars() {
		List<Car> cars = GenerateData.getCars();
		
		Predicate<Car> blueCar = car -> car.getColor().equalsIgnoreCase("blue");
		
		Comparator<Car> comparator = Comparator.comparing(Car::getPrice).reversed();
		
		List<Car> topTwo = cars.stream()
				.filter(blueCar)
				.sorted(comparator)
				.limit(2)
				.collect(Collectors.toList());
		topTwo.forEach(System.out::println);
	}
}
