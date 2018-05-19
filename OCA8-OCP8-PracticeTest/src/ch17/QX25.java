package ch17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class QX25 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2017, 3, 12);
		LocalTime localTime = LocalTime.of(1, 59);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
		Duration duration = Duration.ofMinutes(1);
		ZonedDateTime later = z.plus(duration);
		//
		System.out.println(later.getHour());
		
		localDate = LocalDate.of(2017, 7, 4);
		z = ZonedDateTime.of(localDate, localTime, zone);
		later = z.plus(duration);
		System.out.println(later.getHour());
		
		localDate = LocalDate.of(2017, 11, 5);
		z = ZonedDateTime.of(localDate, localTime, zone);
		later = z.plus(duration);
		System.out.println(later.getHour());
	}
}

// In the United States, daylight savings time for 2017 starts at 2 a.m. on
// March 12th and ends at 2 a.m. on November 5th. Given the sequence in the
// following image, what time comes next on March 12th, July 4th, and November
// 5th, respectively?

// 1:58 -> 1.59 ->?

// 3.00 , 02.00 , 01.00