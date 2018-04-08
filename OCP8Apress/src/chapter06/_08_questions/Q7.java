package chapter06._08_questions;

import java.util.Optional;
import java.util.stream.Stream;

public class Q7 {

	public static void main(String[] args) {
		Stream.of("eeny ", "meeny ", null).forEach(Q7::toUpper);
	}

	private static void toUpper(String str) {
		Optional<String> string = Optional.ofNullable(str);
		System.out.print(string.map(String::toUpperCase).orElse("dummy"));
	}
}
