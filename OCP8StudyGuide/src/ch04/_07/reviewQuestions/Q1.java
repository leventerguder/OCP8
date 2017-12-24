package ch04._07.reviewQuestions;

import java.util.stream.Stream;

public class Q1 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		// System.out.println(stream.limit(2).map(x -> x + "2"));
		// java.util.stream.ReferencePipeline$3@3e3abc88

		// "" -> 1.eleman
		// "1" -> 2.elaman
		// "12" -> 3.eleman
		stream.limit(3).map(x -> x + "2").forEach(System.out::println);
		// 2
		// 12
		// 122
	}
}
