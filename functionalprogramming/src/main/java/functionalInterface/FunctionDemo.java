package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		// Regular method call
		n = incrementByOne(n);
		System.out.println(n);
		
		// Using Functional interface
		n = incrementByOneFunction.apply(n);
		System.out.println(n);
		
		// Use multiplyBy10Function
		n = multiplyBy10Function.apply(n);
		System.out.println(n);
		
		Function<Integer, Integer> add1AndThenMultiply10 =
				incrementByOneFunction.andThen(multiplyBy10Function);
		
		System.out.println(add1AndThenMultiply10.apply(4));
		
		System.out.println(sum2Nos.apply(10, 20));
		
		System.out.println(incrementAndMultiplyByFunction.apply(4, 100));
	}

	static Function<Integer, Integer> incrementByOneFunction =
			number -> number + 1;
			
	static int incrementByOne(int number) {
		return number + 1;
	}
	
	static Function<Integer, Integer> multiplyBy10Function =
			number -> number * 10;
			
	static BiFunction<Integer, Integer, Integer> multiplyByFunction = (n, factor) -> n * factor;
			
	static BiFunction<Integer, Integer, Integer> sum2Nos =
			(n1, n2) -> n1 + n2;
			
	static BiFunction<Integer, Integer, Integer> incrementAndMultiplyByFunction =
			(numToIncrement, multiplyBy) ->
				(numToIncrement + 1) * multiplyBy;
				
//	static BiFunction<Integer, Integer, Integer> incrementAndThenMultiplyBy =
//			(numToIncrement, multiplyBy) ->
//				incrementByOneFunction.andThen(multiplyByFunction);
}
