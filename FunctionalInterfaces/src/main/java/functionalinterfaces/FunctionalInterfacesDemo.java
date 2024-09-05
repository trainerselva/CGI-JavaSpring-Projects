package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calcAddition = (n1, n2) -> n1 + n2;
		
		Arithmetic arith = (x, y) -> x + y;
		
		MyFunctionalInterface intf = new MyFunctionalInterface() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				
			}
			
			void testMethod() {
				System.out.println("Overridden statid testMethod");
			}
		};
		
		StringManipulator toUpperCase = (input) -> input.toUpperCase();
		System.out.println(toUpperCase.manipulate("hello cgi"));
		
		// Combining Functional Interfaces with Streams
		// Also we are going to use function references
		
		List<String> vegetables = Arrays.asList("tomato", "Potato", "Beans", "onion");
		
		Function<String, String> toUpperCase2 = String::toUpperCase;
		
		List<String> upperCasedNames = vegetables.stream()
										.map(toUpperCase2)
										.collect(Collectors.toList());
		
		upperCasedNames.forEach(System.out::println);
	}

	@FunctionalInterface
	public interface MyFunctionalInterface {
		void execute();
		
		static void testMethod() {
			System.out.println("This is a test method");
		}
		
		static void secondStaticMethod() {
			System.out.println("This is second static method in the interface");
		}
		
		default void privateMethod() {
			System.out.println("This is a private method");
		}
		
		default void anotherMethod() {
			System.out.println("This is another default method");
		}
	}
	
	@FunctionalInterface
	public interface Calculator {
		int calculate(int a, int b);
	}
	
	public interface Arithmetic {
		int add(int a, int b);
//		int sub(int a, int b);
	}
	
	//////////////////
	// Creating Custom Functional Interfaces
	
	@FunctionalInterface
	public interface StringManipulator {
		String manipulate(String input);
	}
	
	
	
}
