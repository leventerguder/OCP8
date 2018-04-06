package chapter03.interface$features;

//default methods are instance methods
// you cannot declare members as protected or private. Only public access is allowed for members an interface.
// you can not qualify default methods as synchronized or final.
// you cannot provede abstract keyword for static methods.
//

interface MyInterface {

	default void defaultMethod() {
		System.out.println(this.getClass());
		System.out.println("defaultMethod...");
	}

	static void staticMethod() {
		System.out.println("staticMethod...");
	}
}

class MyInterfaceImpl implements MyInterface {

}

public class Java8InterfaceFeatures {

	public static void main(String[] args) {
		//
		MyInterface obj = new MyInterfaceImpl();
		obj.defaultMethod();
		//

		MyInterface.staticMethod();
		// obj.staticMethod(); // compiler error
		// MyInterfaceImpl.staticMethod(); // compiler error
	}
}
