package ch13;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Stream;

public class QX21 {

	public static void main(String[] args) {
		//
		List<String> list = new LinkedList<>();
		list.add("Archie");
		list.add("X-Men");
		Stream<String> s = list.stream();
		s.forEach(System.out::println);
		System.out.println();
		s.forEach(System.out::println); // exception
		// java.lang.IllegalStateException: stream has already been operated upon or
		// closed
	}
}
