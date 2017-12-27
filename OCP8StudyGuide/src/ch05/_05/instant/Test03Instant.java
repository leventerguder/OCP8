package ch05._05.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test03Instant {

	public static void main(String[] args) {
		Instant instant = Instant.ofEpochSecond(200000);
		System.out.println(instant);

		instant = instant.plus(7, ChronoUnit.DAYS);
		System.out.println(instant);

		instant = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(instant);

		instant = instant.plus(1, ChronoUnit.WEEKS);
		System.out.println(instant);
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// unit: Weeks
	}
}
