package ch05._05.instant;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class Test04Instant {

	public static void main(String[] args) {
		Instant i1 = Instant.now();

		i1 = i1.plus(Period.ofDays(30));
		System.out.println(i1);

		//i1 = i1.plus(Period.ofMonths(1));
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// unit: Months
		
		i1 = i1.plus(Duration.ofSeconds(50));
		System.out.println(i1);
	}
}
