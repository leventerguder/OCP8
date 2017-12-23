package ch04._06.advanced;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test06Summarizing {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		DoubleSummaryStatistics ds = list.stream().collect(Collectors.summarizingDouble(x -> x));
		System.out.println(ds);

		IntSummaryStatistics is = list.stream().collect(Collectors.summarizingInt(x -> x));
		System.out.println(is);

		LongSummaryStatistics ls = list.stream().collect(Collectors.summarizingLong(x -> x));
		System.out.println(ls);

		IntStream intStream = list.stream().mapToInt(x -> x);
		IntSummaryStatistics is2 = intStream.summaryStatistics();
		System.out.println(is2);
		
	}
}
