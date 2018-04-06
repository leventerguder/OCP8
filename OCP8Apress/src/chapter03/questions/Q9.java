package chapter03.questions;

interface BaseInterface {
	default void foo() {
		System.out.println("BaseInterface's foo");
	}
}

interface DerivedInterface extends BaseInterface {
	default void foo() {
		System.out.println("DerivedInterface's foo");
	}
}

interface AnotherInterface {
	public static void foo() {
		System.out.println("AnotherInterface's foo");
	}
}

public class Q9 implements DerivedInterface, AnotherInterface {

	public static void main(String[] args) {
		new Q9().foo();
		//
		AnotherInterface.foo();
	}
}
