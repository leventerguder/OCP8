package _04.library;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class TestMapToInt {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 20, 15, -1,-100);

		IntSummaryStatistics statistic = numbers.stream().mapToInt(number -> number.intValue()).summaryStatistics();
		
		System.out.println(statistic.getMax());
		System.out.println(statistic.getMin());
		System.out.println(statistic.getAverage());
		
	}
}
