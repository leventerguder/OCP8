package ch06._03.tryWithResources;

public class Test04TryWithResourcesAutoCloseable {

	// java strongly recommends that close() not actually throw Exception
	// it is better to throw a more specific exception.

	// java also recommends to make the close method idempotent.
	// Idempotent means that the method can called be multiple times without any
	// side effects or undesirable behavior on subsequent runs.

	public static void main(String[] args) {
		try (ExampleOne exampleOne = new ExampleOne()) {
			System.out.println("try-block");
		}
	}

}

// ExampleOne is the best implementation. ExampleTwo throws Exception rather
// than a more specic subclass, which is not recommended. ExampleThree has a
// side effect. It changes the state of a variable. Side effects are not
// recommended.

class ExampleOne implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
}

class ExampleTwo implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}
}

class ExampleThree implements AutoCloseable {
	static int COUNT = 0;

	public void close() {
		COUNT++;
	}
}