package ch15;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public class QX22 {

	private static void spot(Optional<String> x) {
		x.filter(y -> y.isEmpty()).map(y -> 8).ifPresent(System.out::println);
	}

	private static void spot2(Optional<Collection> x) {
		x.filter(y -> !y.isEmpty()).map(y -> 8).ifPresent(System.out::println);
	}

	private static void spot3(Optional<Stream> x) {
	}

}
