package streamsdeepdive.demos;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P06_DistinctAndSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		distinctDemo();
		distinctWithSetDemo();

	}

	public static void distinctDemo() {
		List<Integer> numbers = List.of(1, 1, 2, 3, 3, 4, 5, 5);
		List<Integer> distinctNumbers = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinctNumbers);
	}
	
	public static void distinctWithSetDemo() {
		List<Integer> numbers = List.of(1, 1, 2, 3, 3, 4, 5, 5);
		Set<Integer> distinctNumbers = numbers.stream()
				.collect(Collectors.toSet());
		System.out.println(distinctNumbers);
	}
}
