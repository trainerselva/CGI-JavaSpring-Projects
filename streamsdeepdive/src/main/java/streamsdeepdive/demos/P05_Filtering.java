package streamsdeepdive.demos;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamsdeepdive.dataclasses.Car;
import streamsdeepdive.dataclasses.GenerateData;

public class P05_Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		filterDemo();
		
//		dropWhileDemo();
		
//		takeWhileDemo();
		
//		findFirstDemo();
		
//		findAnyDemo();
		
//		allMatchDemo();
		
		anyMatchDemo();
	}

	public static void filterDemo() {
		List<Car> cars = GenerateData.getCars();
		
		Predicate<Car> carPriceLessThan10L = car -> car.getPrice() < 1000000;
		Predicate<Car> yellowCar = car -> car.getColor().equals("Yellow");
		
		List<Car> yellowCarsLessThan10L = cars.stream()
				.filter(carPriceLessThan10L)
				.filter(yellowCar)
				.collect(Collectors.toList());
		
		yellowCarsLessThan10L.forEach(System.out::println);
	}
	
	public static void dropWhileDemo() {
		System.out.println("Using Filter");
		Stream.of(1, 2, 4, 6, 8, 9, 10)
			.filter(n -> n % 2 == 0)
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		System.out.println("Using dropWhile");
		Stream.of(2, 4, 6, 8, 9, 10)
			.dropWhile(n -> n % 2 == 0)
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
	}

	public static void takeWhileDemo() {
		System.out.println("Using Filter");
		Stream.of(1, 2, 4, 6, 8, 9, 10)
			.filter(n -> n % 2 == 0)
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		System.out.println("Using takeWhile");
		Stream.of(2, 4, 6, 8, 9, 10)
			.takeWhile(n -> n % 2 == 0)
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
	}
	
	public static void findFirstDemo() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10};
		int result = Arrays.stream(numbers)
				.filter(n -> n == 95)
				.findFirst()
				.orElse(-1);
		
		System.out.println(result);
	}
	
	public static void findAnyDemo() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10};
		int result = Arrays.stream(numbers)
				.filter(n -> n % 3 == 0)
				.findAny()
				.orElse(-1);
		
		System.out.println(result);
		
		List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 12, 7, 8, 9, 5, 10);
		int result2 = numbers2.parallelStream()
				.filter(n -> n % 3 == 0)
				.findAny()
				.orElse(-1);
		
		System.out.println(result2);
	}
	
	public static void allMatchDemo() {
		int[] evens = {2, 4, 6, 8};
		boolean allMatch = Arrays.stream(evens)
				.allMatch(n -> n % 2 == 0);
		System.out.println("All match: " + allMatch);
	}
	
	public static void anyMatchDemo() {
		int[] numbers = {2, 4, 6, 8};
		boolean anyMatch = Arrays.stream(numbers)
				.anyMatch(n -> n % 2 != 0);
		System.out.println("Any match: " + anyMatch);
	}
	
	
}
