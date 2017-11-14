package _03.library;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// Optional is a new core library data type that is designed to provide
		// a better alternative to null.

		// Even the man who invented the concept, Tony Hoare, described it as
		// “my billion-dollar mistake.”

		// null is often used to represent the absence of a value, and this is
		// the use case that Optional is replacing.
		Optional<String> optional = Optional.of("Levent");

		System.out.println(optional.get());

		Optional empty = Optional.empty();
		System.out.println(empty.isPresent());

		Optional alsoEmpty = Optional.ofNullable(null);

		System.out.println(empty);
		System.out.println(alsoEmpty);

		String orelse = (String) alsoEmpty.orElse("hebele");

		System.out.println(orelse);
	}
}
