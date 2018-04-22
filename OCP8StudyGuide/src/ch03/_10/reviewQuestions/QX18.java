package ch03._10.reviewQuestions;

public class QX18 {

	public static void main(String[] args) {
		//
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		C c1 = new C();
	}
}

class A {
}

class B extends A {
}

class C extends B {
}

class D<C> {
	// INSERT CODE HERE
	
	// The type parameter C is hiding the type 
	A a1 = new A();
	A a2 = new B();
//	A a3 = new C();
//	C c1 = new C();
}