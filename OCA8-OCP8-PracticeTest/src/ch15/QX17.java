package ch15;

import java.util.Optional;

public class QX17 {

	// D. isPresent, ifPresent

	private static void longer(Optional<Boolean> opt) {
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
	}

	private static void shorter(Optional<Boolean> opt) {
		opt.map(x -> "run: " + x).ifPresent(System.out::println);
	}

}
