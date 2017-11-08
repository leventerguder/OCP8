package _03.library;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class OverloadedResolution2 {

	static private void overloadedMethod(Predicate<Integer> predicate) {
		System.out.print("Predicate");
	}

	static private void overloadedMethod(IntPredicate predicate) {
		System.out.print("IntPredicate");
	}

	public static void main(String[] args) {
		overloadedMethod((int x) -> true);
		overloadedMethod((Integer x) -> true);
		// overloadedMethod(y -> true);
	}

}
/*
 * In this case, javac will fail to compile the example, complaining that the
 * lambda expression is an ambiguous method call: IntPredicate doesn’t extend
 * any Predicate, so the compiler isn’t able to infer that it’s more specific.
 */

// If there is a single possible target type, the lambda expression infers the
// type from the corresponding argument on the functional interface.

// If there are several possible target types, the most specific type is
// inferred.

// If there are several possible target types and there is no most specific
// type, you must manually provide a type.