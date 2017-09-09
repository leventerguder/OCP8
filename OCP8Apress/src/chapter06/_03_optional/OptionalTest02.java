package chapter06._03_optional;

import java.util.Optional;

public class OptionalTest02 {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		//
		Optional<String> notEmpty = Optional.of("test");
		System.out.println(notEmpty);
		//
		//Optional<String> nullStr = Optional.of(null); // NullPointerException
		//
		Optional<String> nullableStr = Optional.ofNullable(null); //
		System.out.println(nullableStr);
	}
}
