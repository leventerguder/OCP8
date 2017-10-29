package _02.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {

		Predicate<String> p = (String str) -> str.charAt(0) == '1';

		List<String> beginningWithNumber = Stream.of("a", "1abc", "abc1").filter(p).collect(Collectors.toList());

		System.out.println(beginningWithNumber);

	}
}
