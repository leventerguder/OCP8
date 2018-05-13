package ch15;

import java.util.Optional;

public class QX11 {

	public static void main(String[] args) {

		Optional<String> opt1 = Optional.empty();
		// Optional<String> opt2 = Optional.of(null);
		Optional<String> opt3 = Optional.ofNullable(null);

		System.out.println(opt1.isPresent());
		System.out.println(opt3.isPresent());
	}
}
