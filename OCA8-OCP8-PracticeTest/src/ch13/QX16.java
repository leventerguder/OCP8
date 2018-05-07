package ch13;

import java.util.stream.Stream;

public class QX16 {

	public static void main(String[] args) {
		//
		Stream<String> s = Stream.of("Atlanta", "Chicago", "New York");
		long count = s.filter(c -> c.startsWith("C")).count();
		System.out.print(count);
	}
}
