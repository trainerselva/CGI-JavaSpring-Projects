package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GeneralStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem statement
		// Generate a list of females
		
		List<Person> people = getPeople();
		
		// Imperative Approach
		
//		List<Person> females = new ArrayList<Person>();
//		
//		for (Person person : people) {
//			if (person.getGender().equals(Gender.FEMALE)) {
//				females.add(person);
//			}
//		}
//		
//		females.forEach(System.out::println);
		
		// Declarative Approach
		// ====================
		
		// Filter
		
		List<Person> females = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		
//		females.forEach(System.out::println);
		
		// Sort
		
		List<Person> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge)
						.thenComparing(Person::getGender).reversed())
				.collect(Collectors.toList());
		
//		sorted.forEach(System.out::println);
		
		// All match
		
		boolean allMatch = people.stream()
				.allMatch(person -> person.getAge() > 5);
		
//		System.out.println("All match: " + allMatch);
		
		// Any match
		
		boolean anyMatch = people.stream()
				.anyMatch(person -> person.getAge() > 100);
		
//		System.out.println("Any match: " + anyMatch);
		
		// None Match
		
		boolean noneMatch = people.stream()
				.noneMatch(person -> person.getName().equals("Fourth"));
		
//		System.out.println("None match: " + noneMatch);
		
		// Max
		
		people.stream()
			.max(Comparator.comparing(Person::getAge))
			.ifPresent(System.out::println);
		
		// Min
		
		people.stream()
			.min(Comparator.comparing(Person::getAge))
			.ifPresent(System.out::println);
		
		// Group
		
		Map<Gender, List<Person>> groupByGender =
				people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		groupByGender.forEach(
				(gender, persons) -> {
					System.out.println("Gender: " + gender);
					persons.forEach(System.out::println);
					System.out.println();
				}
				);

		// Problem Statement
		// Display the name of the oldest female
		
		Optional<String> oldestFemale =
				people.stream()
					.filter(person -> person.getGender().equals(Gender.FEMALE))
					.max(Comparator.comparing(Person::getAge))
					.map(Person::getName);
		
		oldestFemale.ifPresent(System.out::println);

		Predicate<Person> femalePredicate = 
				person -> person.getGender().equals(Gender.FEMALE);
				
		Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
		
		Optional<String> oldestFemale2 =
				people.stream()
					.filter(femalePredicate)
					.max(ageComparator)
					.map(Person::getName);
		
		oldestFemale2.ifPresent(System.out::println);

	}

	private static List<Person> getPeople() {
		return List.of(
				new Person("First", 20, Gender.MALE),
				new Person("Second", 33, Gender.FEMALE),
				new Person("Third", 57, Gender.FEMALE),
				new Person("Fourth", 14, Gender.MALE),
				new Person("Fifth", 99, Gender.MALE),
				new Person("Sixth", 7, Gender.FEMALE),
				new Person("Seventh", 120, Gender.FEMALE),
				new Person("Eighth", 6, Gender.MALE)
		);
	}
}
