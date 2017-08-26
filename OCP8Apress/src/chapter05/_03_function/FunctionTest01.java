package chapter05._03_function;

import java.util.Arrays;

public class FunctionTest01 {

	public static void main(String[] args) {
		Arrays.stream("4,-9,16".split(",")).map(Integer::parseInt).map(i -> i < 0 ? -i : i)
				.forEach(System.out::println);
	}
}

// public interface Function<T,R> {
// R apply(T t);
// }

// A Function<T, R> “operates” on something and returns something: it takes one
// argument (of generic type T) and returns an object (of generic type R). You
// can call apply() method on a Function object.