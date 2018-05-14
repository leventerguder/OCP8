package ch15;

import java.util.stream.Stream;

public class QX23 {

	public static void main(String[] args) {
		//
		Stream<Integer> stream = Stream.iterate(1, i -> i);
		// boolean b = stream.anyMatch(i -> i > 5); // hang
		// boolean b = stream.noneMatch(i -> i > 5); // hang
		boolean b = stream.allMatch(i -> i > 5); // false

		System.out.println(b);
	}
}
