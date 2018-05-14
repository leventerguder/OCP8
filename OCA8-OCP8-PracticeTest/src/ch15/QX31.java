package ch15;

import java.util.stream.Stream;

public class QX31 {

	public static void main(String[] args) {

		Stream<Character> stream = Stream.of('c', 'b', 'a');
		System.out.println(stream.sorted().findFirst());
		// Optional[a]
		// D. None of the above
	}
}
