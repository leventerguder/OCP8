package chapter05._01_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _03_RemoveIfTest {

	// the removeIf() method added in the Collection interface in Java 8
	// default boolean removeIf(Predicate<? super E> filter)
	public static void main(String[] args) {
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		greeting.add("hi");
		greeting.add("injavawetrust");
		//
		// greeting.removeIf(str -> !str.startsWith("h"));
		Predicate<String> predicate = (String str) -> {
			return str.startsWith("h");
		};
		greeting.removeIf(predicate.negate());
		greeting.forEach(System.out::println);
	}
}
