package ch23;

import java.util.Comparator;
import java.util.stream.Stream;

public class Q5 {
	public static void main(String[] args) {

		Stream<Integer> is = Stream.of(8, 6, 9);
		Comparator<Integer> c = (a, b) -> b - a; // r1
		is.sorted(c).forEach(System.out::print); // r2
		// B. 986
	}
}
