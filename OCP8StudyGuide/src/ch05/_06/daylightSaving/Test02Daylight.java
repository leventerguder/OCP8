package ch05._06.daylightSaving;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test02Daylight {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		//
		System.out.println(dateTime); // 2016-11-06T01:30-04:00[US/Eastern]
		System.out.println(dateTime.plusHours(1)); // 2016-11-06T01:30-05:00[US/Eastern]
	}
}
