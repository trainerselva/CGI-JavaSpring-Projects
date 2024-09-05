package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer ram = new Customer("Ram", "12345");
		
		// Regular Java Method
		greetCustomer(ram);
		greetCustomerV2(ram, false);
		
		// Consumer Functional Interface
		greetCustomerConsumer.accept(ram);
		greetCustomerConsumerV2.accept(ram, false);

	}
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + 
				", thanks for registering with phone number " +
				customer.customerPhoneNumber);
	}
	
	static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + 
				", thanks for registering with phone number " +
				(showPhoneNumber ? customer.customerPhoneNumber : "******"));
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer ->
	System.out.println("Hello " + customer.customerName + 
		", thanks for registering with phone number " +
		customer.customerPhoneNumber);

	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = 
			(customer, showPhoneNumber) ->
				System.out.println("Hello " + customer.customerName + 
				", thanks for registering with phone number " +
				(showPhoneNumber ? customer.customerPhoneNumber : "******"));

	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
	}
}
