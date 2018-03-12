package ch07._16.reviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Q1 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("e1", "e2").parallel();
		Collection<String> c = Arrays.asList("e1", "e2");
		Stream<String> s2 = c.parallelStream();
		//
		
		System.out.println(s.isParallel());
		System.out.println(s2.isParallel());
		
	}
}
// 1. Given an instance of a Stream, s, and a Collection, c, which are valid
// ways of creating a parallel stream? (Choose all that apply.)

// A. new ParallelStream(s)
// B. c.parallel()
// C. s.parallelStream()
// D. c.parallelStream() (+)
// E. new ParallelStream(c)
// F. s.parallel() (+)