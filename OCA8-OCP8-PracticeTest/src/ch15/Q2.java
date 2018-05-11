package ch15;

import java.util.stream.Stream;

public class Q2 {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
		boolean b = stream.allMatch(i -> i > 5);
		System.out.println(b);
	}
}
