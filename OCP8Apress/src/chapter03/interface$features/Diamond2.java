package chapter03.interface$features;

class BaseClass {
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface {
	default public void foo() {
		System.out.println("BaseInterface's foo");
	}
}

// no compiler error in this case , the compiler resolves to the definition in the class and the interface definition is ignored.

public class Diamond2 extends BaseClass implements BaseInterface {
	public static void main(String[] args) {
		new Diamond2().foo();
	}
}