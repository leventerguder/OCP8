package chapter06._04_calculation;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.regex.Pattern;

public class IntSummaryStatisticsTest01 {

	public static void main(String[] args) {
		String sentence = "There was a young lady named Bright " + "who traveled much faster than light "
				+ "She set out one day " + "in a relative way " + "and came back the previous night ";

		int sum = Pattern.compile(" ").splitAsStream(sentence).mapToInt(String::length).sum();
		long count = Pattern.compile(" ").splitAsStream(sentence).mapToInt(String::length).count();
		OptionalInt min = Pattern.compile(" ").splitAsStream(sentence).mapToInt(String::length).min();
		OptionalInt max = Pattern.compile(" ").splitAsStream(sentence).mapToInt(String::length).max();
		OptionalDouble average = Pattern.compile(" ").splitAsStream(sentence).mapToInt(String::length).average();

		System.out.println("sum : " + sum + " count : " + count + " min : " + min.getAsInt() + " max : "
				+ max.getAsInt() + " average : " + average.getAsDouble());

		IntSummaryStatistics statistics = Pattern.compile(" ").splitAsStream(sentence).mapToInt(word -> word.length())
				.summaryStatistics();
		System.out.println(statistics);
	}
}
