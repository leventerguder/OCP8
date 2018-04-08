package chapter08._07_temporalunit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TemporalUnitTest02 {

	public static void main(String[] args) {
		//
		Duration duration1 = Duration.of(1, ChronoUnit.MINUTES);
		System.out.println(duration1);
		System.out.println(duration1.getSeconds());
		//
		Duration duration2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(duration2.getSeconds());

		//
		Duration duration3 = Duration.of(1, ChronoUnit.DAYS);
		System.out.println(duration3.getSeconds());
	}
}
