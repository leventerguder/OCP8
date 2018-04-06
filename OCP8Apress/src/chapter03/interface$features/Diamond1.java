package chapter03.interface$features;

// the diamond problem can occur in the derived class when an abstract class an interface define a method with same signature.
//
// if two super interfaces have the same method name and one of them has a definition, the compiler will issue an error. this conflict has to be resolved manually.
// if a base class and a base interface define methods with the same signature the method definition in the class is used and the interface definition is ignored.

interface Interface1 {
	default public void foo() {
		System.out.println("Interface1's foo");
	}
}

interface Interface2 {
	default public void foo() {
		System.out.println("Interface2's foo");
	}
}

public class Diamond1 implements Interface1, Interface2 {

	@Override
	public void foo() {
		Interface1.super.foo();
	}

}
