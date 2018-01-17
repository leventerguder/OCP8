package ch07._04.callable;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Test01AmbiguousLambdaSample {

	public static void useCallable(Callable<Integer> expression) {

	}

	public static void useSupplier(Supplier<Integer> expression) {
	}

	public static void use(Supplier<Integer> expression) {
	}

	public static void use(Callable<Integer> expression) {
	}

	public static void main(String[] args) {
		useCallable(() -> {
			throw new IOException();
		});

		// compiler error
		// useSupplier(() -> {
		// throw new IOException();
		// });

		// The method use(Supplier<Integer>) is ambiguous for the type
		// AmbiguousLambdaSample
		// use(() -> {throw new IOException();});
		
		use((Callable<Integer>)() -> {throw new IOException("");});
	}
}
