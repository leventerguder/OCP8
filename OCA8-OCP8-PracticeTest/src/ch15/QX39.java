package ch15;

import java.util.Optional;

public class QX39 {

	public static void main(String[] args) {

		Optional opt = Optional.empty();

		try {
			apply(opt);
		} catch (Exception e) {
			System.out.println("Caught it!");
		}
	}

	private static void apply(Optional<Exception> opt) {
		opt.orElseThrow(IllegalArgumentException::new);
	}
}
