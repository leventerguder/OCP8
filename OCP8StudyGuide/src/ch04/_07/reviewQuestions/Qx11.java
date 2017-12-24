package ch04._07.reviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qx11 {

	public static void main(String[] args) {
		System.out.println(Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining())); // 11111
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining())); // 12345
	}
}
