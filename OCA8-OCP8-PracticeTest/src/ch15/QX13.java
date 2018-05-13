package ch15;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class QX13 {

	public static void main(String[] args) {

		// compile error
		// IntegerStream pages = IntegerStream.of(200, 300);
		// IntegerSummaryStatistics stats = pages.summaryStatistics();

		IntStream pages = IntStream.of(200, 300);
		IntSummaryStatistics stats = pages.summaryStatistics();

		long total = stats.getSum();
		long count = stats.getCount();
		System.out.println(total + "-" + count);
	}
}
