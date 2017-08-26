package chapter05._03_function;

import java.util.Arrays;
import java.util.function.Function;

public class _04_FunctionTest {

	public static void main(String[] args) {
		Arrays.stream("4,-9,16".split(",")).map(Function.identity()).forEach(System.out::println);
	}

	// The identity() function in Function just returns the passed argument
	// without doing anything! Then what is its use? It is sometimes used for
	// testing – when you write a piece of code that takes a Function and want
	// to check if it works, you can call identity() because it doesn’t do
	// anything.
}
