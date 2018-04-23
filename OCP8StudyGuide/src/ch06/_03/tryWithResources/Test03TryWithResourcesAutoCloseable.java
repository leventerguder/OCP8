package ch06._03.tryWithResources;

public class Test03TryWithResourcesAutoCloseable {

	// You cant put any random class in try-with-resources statement.

	public static void main(String[] args) throws Exception {

		// Compiler error!
		// The resource type Animal does not implement java.lang.AutoCloseable
		// try (Animal animal = new Animal()) {
		// //
		// }
		
		
		//Unhandled exception type Exception thrown by automatic close() invocation on bird
		// handle or declare!
		try (Bird bird = new Bird()) {
			System.out.println("try-block");
		}
		System.out.println("after try");
	}
}

class Animal {

}

class Bird implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Bird#close....");
	}

}