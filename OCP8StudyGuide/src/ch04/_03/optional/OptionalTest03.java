package ch04._03.optional;

import java.util.Optional;

public class OptionalTest03 {

	public static void main(String[] args) {
		//
		Optional<Integer> empty = Optional.empty();
		System.out.println(empty); // Optional.empty
		// System.out.println(empty.get());
		// java.util.NoSuchElementException

		// Optional<Integer> null1 = Optional.of(null);
		//
		Optional<Integer> nullable = Optional.ofNullable(null);
		System.out.println(nullable);// Optional.empty

		// System.out.println(nullable.get());
		// java.util.NoSuchElementException

		//
		Optional<Integer> opt = Optional.of(100);
		opt.ifPresent(System.out::println);
	}
}
