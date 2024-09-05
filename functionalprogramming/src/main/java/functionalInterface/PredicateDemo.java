package functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Traditional method - without predicate");
		System.out.println(isPhoneNumberValid("+911122334455"));
		System.out.println(isPhoneNumberValid("+9111223344"));
		System.out.println(isPhoneNumberValid("+351122334455"));

		System.out.println("Functional approach - with Predicate");
		System.out.println(isPhoneNumberValidPredicate.test("+911122334455"));
		System.out.println(isPhoneNumberValidPredicate.test("+9111223344"));
		System.out.println(isPhoneNumberValidPredicate.test("+351122334455"));
		
		System.out.println(
				"Is phone number valid AND contains 8 - " +
				isPhoneNumberValidPredicate.and(containsNumber8).test("+911122334485")
		);
		
		System.out.println(
				"Is phone number valid OR contains 8 - " +
				isPhoneNumberValidPredicate.or(containsNumber8).test("+901122334495")
		);
		

	}

	// Traditional method - without predicate
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+91") && 
				phoneNumber.length() == 13;
	}
	
	// Functional approach - with Predicate
	
	static Predicate<String> isPhoneNumberValidPredicate = 
			phoneNumber -> phoneNumber.startsWith("+91") && 
							phoneNumber.length() == 13;
			
	static Predicate<String> containsNumber8 = 
			phoneNumber -> phoneNumber.contains("8");
}
