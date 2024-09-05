package streamsdeepdive.demos;

import java.util.List;
import java.util.stream.Collectors;

public class P10_JoiningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joiningStringsUsingStringBuilder();
		
		joiningStringsUsingStream();
	}
	
	// Traditional method

	// Using the StringBuilder
	// The strings are all in lowercase
	// The concatenated strings should have the first character in uppercase
	//		and other characters in lowercase
	
	public static void joiningStringsUsingStringBuilder() {
		List<String> names = List.of("first", "second", "third", "fourth", "fifth");
		StringBuilder joinedNames = new StringBuilder();
		
		for (String name : names) {
			joinedNames.append(name.substring(0, 1).toUpperCase())
				.append(name.substring(1))
				.append(", ");
		}
		
		System.out.println(joinedNames);
		System.out.println(joinedNames.substring(0, joinedNames.length() - 2));
	}
	
	// Joining strings using stream
	
	public static void joiningStringsUsingStream() {
		List<String> names = List.of("first", "second", "third", "fourth", "fifth");
		String joinedNames = names.stream()
				.map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
				.collect(Collectors.joining("|"));
		System.out.println(joinedNames);
	}

}
