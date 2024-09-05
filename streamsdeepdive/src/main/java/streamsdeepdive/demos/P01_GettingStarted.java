package streamsdeepdive.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.GenerateData;
import streamsdeepdive.dataclasses.Person;

public class P01_GettingStarted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem statement
		// 1. Find people aged less than or equal to 18
		// 2. Find first 2 people
		
		System.out.println("Imperative Approach");
		imperativeApproach();
		
		System.out.println("Declarative Approach");
		declarativeApproach();
		
	}
	
	public static void imperativeApproach() {
		
		List<Person> people = GenerateData.getPeople();
		List<Person> youngPeople = new ArrayList<Person>();
		int limit = 2;
		int counter = 0;
		
		for (Person person : people) {
			if (person.getAge() <= 18) {
				youngPeople.add(person);
				++counter;
				if (counter == limit) {
					break;
				}
			}
		}
		youngPeople.forEach(System.out::println);
	}
	
	public static void declarativeApproach() {
		
		List<Person> people = GenerateData.getPeople();
		List<Person> youngPeople = people.stream()
				.filter(p -> p.getAge() <= 18)
				.limit(2)
				.collect(Collectors.toList());
		youngPeople.forEach(System.out::println);
	}

}
