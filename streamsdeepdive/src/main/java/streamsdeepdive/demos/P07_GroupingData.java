package streamsdeepdive.demos;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamsdeepdive.dataclasses.Car;
import streamsdeepdive.dataclasses.GenerateData;

public class P07_GroupingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		simpleGrouping();
		
		groupingAndCounting();
	}

	public static void simpleGrouping() {
		Map<String, List<Car>> carGroups = 
				GenerateData.getCars()
				.stream()
				.collect(Collectors.groupingBy(Car::getMake));
		
		carGroups.forEach(
				(make, cars) -> {
					System.out.println("Make: " + make);
					cars.forEach(System.out::println);
					System.out.println("---------------");
				}
		);
	}
	
	public static void groupingAndCounting() {
		List<String> cities = List.of(
				"Bangalore",
				"Mumbai",
				"Bangalore",
				"New Delhi",
				"Bangalore",
				"Mumbai",
				"Bangalore"
		);
		
		Map<String, Long> mapOfCitiesWithCounts =
				cities.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
				));
		
		System.out.println(mapOfCitiesWithCounts);
	}
}
