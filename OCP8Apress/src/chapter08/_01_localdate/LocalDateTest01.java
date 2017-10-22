package chapter08._01_localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {

	public static void main(String[] args) {
		// The Java 8 date and time API uses ISO 8601 as the default calendar
		// format.

		LocalDate today = LocalDate.now();
		System.out.println(today);

		// The LocalDate.now() method gets the current date using the system
		// clock, based on the default time zone.

		LocalDate valentinesDay = LocalDate.of(-2018, Month.FEBRUARY, 14); //Year , Month , Day
		System.out.println(valentinesDay);
		
		LocalDate today2 = LocalDate.now();
		System.out.println(today2.plusDays(20));
	}
}
