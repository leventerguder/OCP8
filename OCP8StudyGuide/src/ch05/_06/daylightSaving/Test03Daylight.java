package ch05._06.daylightSaving;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test03Daylight {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(2, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zdt = ZonedDateTime.of(date, time, zone);
		//
		System.out.println(zdt);
		// 2016-03-13T03:30-04:00[US/Eastern]
		// Java is smart enough to know that there is no 2:30 a.m. that night
		// and switches over to the appropriate GMT offset.
	}
}
