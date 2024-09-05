package streamsdeepdive.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P02_WorkingWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		streamDemo();
	}

	public static void streamDemo() {
		// Creating a stream from a collection
		List<String> names = List.of("Amitabh", "Sridevi", "Priyanka");
		Stream<String> stream = names.stream();
		
//		System.out.println("Stream from a list");
//		stream.forEach(System.out::println);
		
		// Creating a stream directly from a list of values / objects
		Stream<String> namesStream = Stream.of("Rajnikant", "Anushka", "Samantha");
		System.out.println("Direct stream of names");
		namesStream.forEach(System.out::println);
		
		// Additional processing on stream - counting
		long count = stream
			.limit(2)
//			.map(null)
//			.sorted(null)
//			.dropWhile(null)
			.count();
		System.out.println("Count: " + count);
		
		// If we have an array and want to create a stream from it
		String[] namesArray = {"First", "Second", "Third"};
		Arrays.stream(namesArray)
			.forEach(System.out::println);
		
	}
}
