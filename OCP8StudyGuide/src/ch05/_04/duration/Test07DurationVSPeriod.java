package ch05._04.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Test07DurationVSPeriod {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 25);
		Period period = Period.ofDays(1);
		Duration duration = Duration.ofDays(1);

		System.out.println(period); // P1D
		System.out.println(duration);// PT24H

		System.out.println(date.plus(period));
		System.out.println(date.plus(duration));
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// unit: Seconds
		
		//Since we are working with a LocalDate, we are required to use Period
	}
}
