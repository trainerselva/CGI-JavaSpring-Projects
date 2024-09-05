package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(
				"Priya",
				"priya@gmail.com",
				"+911122334455",
				LocalDate.of(2000, 1, 1)
		);
		
		// Traditional approach
		
//		System.out.println(new CustomerValidatorService().isValid(customer));
		
		// Using the Combinator Functional pattern
		
		ValidationResult result = isEmailValid()
				.and(isPhoneNumberValid())
				.and(isAnAdult())
				.apply(customer);
		
		System.out.println(result);
		
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}

}
