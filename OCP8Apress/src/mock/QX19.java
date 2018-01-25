package mock;

public class QX19 {

}

// Which one of the following class definitions will compile without any errors?

class P<T> {
	// static T s_mem; //Cannot make a static reference to the non-static type T
}

class Q<T> {
	T mem;

	public Q(T arg) {
		mem = arg;
	}
}

class R<T> {
	T mem;

	public R() {
		// mem = new T(); //Cannot instantiate the type T
	}
}

class S<T> {
	T[] arr;

	public S() {
		//arr = new T[10]; //Cannot create a generic array of T		
	}
}