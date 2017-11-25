package ch03._02.generics;

import java.util.List;
import java.util.ArrayList;

class A {
}

class B extends A {
}

class C extends B {
}

public class Clazz {

	public static void main(String[] args) {

		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();

		// List<? extends B> list4 = new ArrayList<A>(); // compiler error
		List<? super B> list5 = new ArrayList<A>();

		// List<?> list6 = new ArrayList<? extends A>();
		// The problem is that you need to know what that type will be when
		// instantiating the ArrayList.
	}

	<T> T method1(List<? extends T> list) {
		List<? extends T> lt = new ArrayList<T>();
		List<T> lt2 = new ArrayList<T>();
		return list.get(0);
	}

	// method2() does not compile because the return type isn’t actually a type.
	// <T> <? extends T> method2(List<? extends T> list) { // DOES NOT COMPILE
	// return list.get(0);
	// }

	// Coincidentally, B is also the name of a class. It isn’t a coincidence.
	// It’s an evil trick
	// <B extends A> B method3(List<B> list) {
	// return new B(); // DOES NOT COMPILE
	// }

	void method4(List<? super B> list) {
	}

	// method5() does not compile because it tries to mix a method-speci c type
	// parameter with a wildcard. A wildcard must have a ? in it.
	//<X> void method5(List<X super B> list) { // DOES NOT COMPILE }

	<T extends A> void  method6() {
	
	}
}
