package ch05._06.daylightSaving;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test01Daylight {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		//
		ZonedDateTime zdt = ZonedDateTime.of(date, time, zone); // 2016-03-13T01:30-05:00[US/Eastern]

		System.out.println(zdt);
		System.out.println(zdt.plusHours(1)); // 2016-03-13T03:30-04:00[US/Eastern]
	}

}

/*
 * In the United States, we move the clocks an hour ahead in March and move them
 * an hour back in November. The exam will let you know if a date/time mentioned
 * falls on a weekend when the clocks are scheduled to be changed. If it is not
 * mentioned in a question, you can assume that is a normal weekend. We
 * officially change our clocks at 2 a.m., which falls very early Sunday
 * morning.
 */

/*
 * Another way to look at it is that there is one day in March that is 23 hours
 * long and one day in November that is 25 hours long.
 */

/*
 * For example, on March 13, 2016, we move our clocks forward an hour and jump
 * from 2:00 a.m. to 3:00 a.m. This means that there is no 2:30 a.m. that day.
 * If we wanted to know the time an hour later than 1:30, it would be 3:30.
 */
