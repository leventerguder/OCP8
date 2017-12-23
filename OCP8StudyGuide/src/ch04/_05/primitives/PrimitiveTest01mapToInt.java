package ch04._05.primitives;

import java.util.stream.Stream;

public class PrimitiveTest01mapToInt {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1, 2, 3);
		Integer reduced = s1.reduce(0, (s, n) -> s + n);
		System.out.println(reduced); // 6

		//
		Stream<Integer> s2 = Stream.of(1, 2, 3);
		int sum = s2.mapToInt(x -> x).sum();
		System.out.println(sum);
	}
}
