package ch20;

import java.util.Arrays;
import java.util.function.BiFunction;

public class QX14 {

	public static void main(String[] args) {
		new GoodAccumulator().test();
	}
}

class GoodAccumulator {
	int i;

	public void test() {

		BiFunction<Integer, Integer, Integer> accumulator = (a, b) ->5;

		System.out.println(Arrays.asList(1, 2, 3, 4, 5).parallelStream().reduce(0, accumulator, (s1, s2) -> s1 + s2));
	}
}
// Given the following code snippet, which lambda expression is the best choice
// for the accumulator, based on the rules for applying a parallel reduction?

// An accumulator in a serial or parallel reduction must be associative and stateless.

// (a,b) -> (a-b) // not associative
// (a,b) -> 5
// (a,b) -> i++ // not stateless
// None of the above are appropriate