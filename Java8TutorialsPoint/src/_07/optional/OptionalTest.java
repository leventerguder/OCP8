package _07.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// public final class Optional<T> extends Object

		Integer value = null;
		Optional<Integer> a = Optional.ofNullable(value);
		System.out.println(a);

		// Optional.of throws NPE if null
		Integer value2 = 10;
		Optional<Integer> b = Optional.of(value2);

		System.out.println(a.isPresent());
		System.out.println(b.isPresent());

		// Optional.orElse return the value if present otherwiese returns the
		// default value

		Integer v1 = a.orElse(new Integer(0));
		Integer v2 = b.get();

		System.out.println(v1 + v2);
	}
}
