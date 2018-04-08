package chapter05._03_function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest01 {

	public static void main(String[] args) {

		Function<String, Integer> f1 = Integer::parseInt;
		Function<String, Integer> f2 = (String s) -> Integer.parseInt(s);
		
		Function<String, Integer> f4 = String::length; // !!!
		
		Function <Integer,Integer> f3 = Math::abs;

		Arrays.stream("4,-9,16".split(",")).map(Integer::parseInt).map(i -> i < 0 ? -i : i)
				.forEach(System.out::println);
		
		//
		Arrays.stream("4,-9,16".split(",")).map(f1).map(f3).forEach(System.out::println);
		
	}
}

// public interface Function<T,R> {
// R apply(T t);
// }

// A Function<T, R> “operates” on something and returns something: it takes one
// argument (of generic type T) and returns an object (of generic type R). You
// can call apply() method on a Function object.