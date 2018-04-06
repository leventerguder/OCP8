package chapter03.questions;

interface DoNothing {
	default void doNothing() {
		System.out.println("doNothing");
	}
}

@FunctionalInterface
interface DontDoAnything extends DoNothing {
	@Override
	abstract void doNothing();
	// A default method can be overridden in a derived interface and can be made
	// abstract.
}

class Q7 {
	public static void main(String[] args) {
		DontDoAnything beIdle = () -> System.out.println("be idle");
		beIdle.doNothing();
	}
}