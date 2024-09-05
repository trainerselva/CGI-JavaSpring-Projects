package streamsdeepdive.demos;

import java.util.Comparator;
import java.util.List;

public class P09_MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minDemo();
		
		maxDemo();
	}
	
	public static void minDemo() {
		List<Integer> numbers = List.of(20, 10, 30, 100, 25, 93, 99);
		Integer min = numbers.stream()
				.min(Comparator.naturalOrder())
				.get();
		System.out.println(min);
	}
	
	public static void maxDemo() {
		List<Integer> numbers = List.of(20, 10, 30, 100, 25, 93, 99);
		Integer max = numbers.stream()
				.max(Comparator.naturalOrder())
				.get();
		System.out.println(max);
	}

}
