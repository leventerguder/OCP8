package ch15;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class QX26 {

	public static void main(String[] args) {

		LongStream stream = LongStream.of(6, 10);
		LongSummaryStatistics stats = stream.summaryStatistics();
		System.out.print(stats.getAverage());
		
		//  public final double getAverage() {
	}
}
