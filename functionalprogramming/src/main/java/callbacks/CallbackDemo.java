package callbacks;

import java.util.function.Consumer;

public class CallbackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hello("Amitabh", null, 
				value -> {
			System.out.println("No lastName provided for " + value);
		});
		
		helloV2("Amitabh", null,
				() -> System.out.println("No lastName provided"));
	}

	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}
	}
	
	static void helloV2(String firstName, String lastName, Runnable callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.run();
		}
	}
	
	// We want to do something like this as in JavaScript
//	function hello(firstName, lastName, callback) {
//		console.log(firstname);
//		if (lastName) {
//			console.log(lastname);
//		} else {
//			callback();
//		}
//	}
}
