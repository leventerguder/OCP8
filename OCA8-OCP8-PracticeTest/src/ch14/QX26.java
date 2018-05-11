package ch14;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.function.UnaryOperator;

public class QX26 {

	public void main(String... rays) {
		dawn1(s -> s + 1);
		dawn2(s -> s + 1);
		dawn3(s -> s + 1);
		// dawn4(s -> s + 1); // compile error
	}

	private static void dawn1(DoubleUnaryOperator d) {

	}

	private static void dawn2(Function<String, String> d) {

	}

	private static void dawn3(IntToLongFunction d) {

	}

	// D. UnaryOperator compile error

	private static void dawn4(UnaryOperator d) {

	}
}
