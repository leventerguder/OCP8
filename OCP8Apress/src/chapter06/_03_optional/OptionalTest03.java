package chapter06._03_optional;

import java.util.Optional;

public class OptionalTest03 {

	public static void main(String[] args) {
		Optional<String> str = Optional.of("levent");
		str.ifPresent(System.out::println);

		//
		Optional<String> str2 = Optional.ofNullable(null);
		System.out.println(str2.map(String::length).orElse(-1));
		

		Optional<String> str3 = Optional.ofNullable(null);
		System.out.println(str3.map(String::length).orElseThrow(IllegalArgumentException::new));

	}
}
