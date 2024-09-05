package functionalinterfaces;

public class DefaultInterfaceMethodDemo implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("Overridden method to resolve conflict");
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}

interface InterfaceA {
	default void myMethod() {
		System.out.println("InterfaceA default method");
	}
	
	static void staticMethod() {
		System.out.println("InterfaceA staticMethod");
	}
	
	void abstractMethod();
}

interface InterfaceB {
	default void myMethod() {
		System.out.println("InterfaceB default method");
	}
	
	static void staticMethod() {
		System.out.println("InterfaceB staticMethod");
	}
	
	void abstractMethod();
}
