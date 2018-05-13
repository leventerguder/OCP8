package ch15;

import java.util.stream.Stream;
import java.util.Comparator;

public class QX20 {

	public static void main(String[] args) {
		//
		Stream<String> s = Stream.of("over the river", "through the woods", "to grandmother's house we go");
//		  s.filter(n -> n.startsWith("t")).sorted(Comparator::reverseOrder)
//		 .findFirst() .ifPresent(System.out::println);
		// compile error
		//
	}
}
