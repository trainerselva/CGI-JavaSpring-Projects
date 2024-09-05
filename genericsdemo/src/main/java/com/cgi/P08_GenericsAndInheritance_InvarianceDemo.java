package com.cgi;

import java.util.List;

// Generics follow the principle of invariance.
// So List<String> is not a subtype of List<Object>

public class P08_GenericsAndInheritance_InvarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("Welcome", "CGI");
		List<Object> objectList = stringList; // Compile-time error
	}

}
