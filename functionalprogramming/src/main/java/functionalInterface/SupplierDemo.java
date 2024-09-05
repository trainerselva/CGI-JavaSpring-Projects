package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDBConnectionUrl());
		System.out.println(getDBConnectionUrlsSupplier.get());

	}
	
	// Traditional method
	
	static String getDBConnectionUrl() {
		return "jdbc://localhost:3306/users";
	}
	
	// Supplier functional interface method
	
	static Supplier<List<String>> getDBConnectionUrlsSupplier = 
			() -> List.of(
				"jdbc://localhost:3306/users",
				"jdbc://localhost:3306/customer"
			);
			

}
