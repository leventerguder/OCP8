package chapter05._01_predicate;

import java.util.stream.Stream;

public class PredicateTest01 {

	public static void main(String[] args) {
		Stream.of("hello", "world", "injavawetrust").filter(str -> str.startsWith("h")).forEach(System.out::println);
	}
}

//@FunctionalInterface
//public interface Predicate<T> {
//	boolean test(T t);
//}

//A Predicate<T> “affirms” something as true or false: it takes an argument of type T, and returns a
//boolean value. You can call test() method on a Predicate object.