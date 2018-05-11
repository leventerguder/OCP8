package ch14;

import java.util.function.IntFunction;

public class QX38 {

	// IntFunction<Integer> f1 = (Integer f) ->f; // Lambda expression's
	// parameter f is expected to be of type int

	IntFunction<Integer> f2 = (v) -> null;
	IntFunction<Integer> f3 = s -> s;
}

// Which of the following lambda expressions can be passed to a method that
// takes IntFunction<Integer> as an argument?