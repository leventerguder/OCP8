package ch15;

import java.util.stream.Stream;

public class QX15 {

	public static void main(String[] args) {

		Stream<Character> stream = Stream.of('c', 'b', 'a');
		stream.sorted().findAny().ifPresent(System.out::println);
		//
		// The findAny() method is not guaranteed to return a specific
		// element. Since we are not using parallelization, it is highly likely
		// that the code will print a.
	}
}
