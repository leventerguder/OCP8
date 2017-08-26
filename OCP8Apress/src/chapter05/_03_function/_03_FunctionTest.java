package chapter05._03_function;

import java.util.Arrays;
import java.util.function.Function;

public class _03_FunctionTest {

	public static void main(String[] args) {

		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> absInt = Math::abs; // int abs(int a)
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
		Function<String, Integer> parseAndAbsInt2 = absInt.compose(parseInt);
		//
		Arrays.stream("4,-9,16".split(",")).map(parseAndAbsInt).forEach(System.out::println);
		Arrays.stream("4,-9,16".split(",")).map(parseAndAbsInt2).forEach(System.out::println);

		// What is the difference between andThen() and compose() methods in
		// Function interface? The andThen() method applies the passed argument
		// after calling the current Function (as in this example). The
		// compose() method calls the argument before calling the current
		// Function, as in:

	}
}
