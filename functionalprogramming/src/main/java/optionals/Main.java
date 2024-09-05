package optionals;

import java.util.Optional;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "";
//		sendEmail(email);
		
//		boolean isEmailPresent = Optional.of(email)
//			.isPresent();
		
//		boolean isEmailPresent = Optional.ofNullable(email).isPresent();
//		
//		if (isEmailPresent) {
//			System.out.println("Sending email to: " + email);
//		} else {
//			System.out.println("Cannot send email, address missing.");
//		}

		Predicate<String> isStringLengthZero = str -> str.length() == 0;
		
		Optional.ofNullable(email)
			.ifPresentOrElse(
					emailAddress -> {
						if (isStringLengthZero.test(emailAddress)) {
								System.out.println("Cannot send email to empty address");
						} else {
								System.out.println("Sending email to: " + emailAddress);
						}
					}
					,
					
					() -> System.out.println("Cannot send email to empty address"));
	}
	
	@SuppressWarnings("null")
	static void sendEmail(String email) {
		if (email != null || !email.equals("")) {
			System.out.println("Sending email to: " + email);
		} else {
			System.out.println("Cannot send email, email address missing");
		}
	}

}
