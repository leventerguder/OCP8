package ch05._04.duration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test04ChronoUnitBetween {

	public static void main(String[] args) {
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		//
		LocalDate date = LocalDate.of(2017, 12, 27);
		LocalDate date2 = LocalDate.of(2017, 12, 28);
		//
		System.out.println(one.isBefore(two));

		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75

		System.out.println(ChronoUnit.DAYS.between(date, date2)); // 1

		// System.out.println(ChronoUnit.MINUTES.between(date, date2));
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// unit: Minutes
		System.out.println(ChronoUnit.MINUTES.between(one, date));
		// Exception in thread "main" java.time.DateTimeException: Unable to
		// obtain LocalTime from TemporalAccessor: 2017-12-27 of type
		// java.time.LocalDate
	}
}
