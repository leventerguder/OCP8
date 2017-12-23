package ch04._06.advanced;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test05Averaging {

	public static void main(String[] args) {
		//
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		Double d1 = s1.collect(Collectors.averagingInt(String::length));

		System.out.println(d1);
	}
}
