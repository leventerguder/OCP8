package ch04._06.advanced;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test10MaxByMinBy {

	public static void main(String[] args) {
		//
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");

		Comparator<String> com = Comparator.comparing(String::length);
		Comparator<String> com2 = (String str, String str2) -> str.length() - str2.length();

		String maxLength = s1.max(com).get();
		String minLength = s2.min(com).get();
		String minLength2 = s3.min(com2).get();

		System.out.println(maxLength);
		System.out.println(minLength);
		System.out.println(minLength2);

	}
}
