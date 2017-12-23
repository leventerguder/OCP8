package ch04._05.primitives;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class PrimitiveTest08IntSummaryStatistics {

	public static void main(String[] args) {
		//
		Random r = new Random();
		IntStream is = IntStream.generate(r::nextInt).limit(4);
		// is.forEach(System.out::println);

		IntSummaryStatistics stats = is.summaryStatistics();

		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getAverage());
	}
}
