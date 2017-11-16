package _03.library;

interface MyInterface {
	public static void testMethod() {
		System.out.println("MyInterface#testMethod");
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		MyInterface.testMethod();
	}
}
