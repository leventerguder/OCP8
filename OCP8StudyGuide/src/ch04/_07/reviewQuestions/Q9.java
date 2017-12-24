package ch04._07.reviewQuestions;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Q9 {

	public static void main(String[] args) {
		LongStream ls = LongStream.of(1, 2, 3);

		OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst(); // empty!
		System.out.println(opt); // OptinalLong.empty

		// no output
		if (opt.isPresent())
			System.out.println(opt.getAsLong());
		
		opt.ifPresent(System.out::println);
	}

}
