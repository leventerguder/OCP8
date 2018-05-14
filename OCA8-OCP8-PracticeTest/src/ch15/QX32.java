package ch15;

import java.util.Comparator;
import java.util.stream.Stream;

public class QX32 {

	public static void main(String[] args) {

		Stream<Integer> is = Stream.of(8, 6, 9);
		Comparator<Integer> c = (a, b) -> a - b;
		//is.sort(c).forEach(System.out::print);
		// C. The code does not compile
		
		is.sorted(c).forEach(System.out::print);
	}

}
