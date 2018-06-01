package ch23;

import java.util.Arrays;
import java.util.stream.Stream;

public class QX39 {

}

class QuickSolution {

	public static int findFast(Stream<Integer> s) {
		return s.findAny().get();
	}

	public static int findSlow(Stream<Integer> s) {
		return s.parallel().findFirst().get();
	}

	public static void main(String[] pencil) {
		Stream<Integer> s1 = Arrays.asList(1, 2, 3, 4, 5).stream();
		Stream<Integer> s2 = Arrays.asList(1, 2, 3, 4, 5).stream();
		int val1 = findFast(s1);
		int val2 = findSlow(s2);
		System.out.print(val1 + " " + val2);

		// The findFirst() method returns the first
		// element in an ordered stream, whether it be serial or parallel.

		// findAny() method may return the first element or any element in the
		// stream, even on serial streams.
	}
}