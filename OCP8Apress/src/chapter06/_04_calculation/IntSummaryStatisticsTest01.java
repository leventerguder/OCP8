package chapter06._04_calculation;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class IntSummaryStatisticsTest01 {

	public static void main(String[] args) {
		String sentence = "There was a young lady named Bright " + "who traveled much faster than light "
				+ "She set out one day " + "in a relative way " + "and came back the previous night ";

		IntSummaryStatistics statistics = Pattern.compile(" ").splitAsStream(sentence).mapToInt(word -> word.length())
				.summaryStatistics();
		System.out.println(statistics);
	}
}
