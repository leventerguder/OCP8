package ch04._03.optional;

import java.util.Optional;

public class OptionalTest05 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("injavawetrust");
		// String # public int length()
		Optional<Integer> optLength = optStr.map(String::length);

		Optional<Integer> optLength2 = optStr.map(OptionalTest05::length);
	}

	public static int length(String s) {
		return s.length();
	}

	public int length2() {
		return 10;
	}
}
