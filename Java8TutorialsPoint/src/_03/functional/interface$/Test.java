package _03.functional.interface$;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// public interface Predicate<T> {
		// boolean test(T t)

		Predicate<Integer> p = i -> i % 2 == 0;

		list.stream().filter(p).forEach(System.out::println);
	}
}

// functional interfaces have a single functionality to exhibit.
