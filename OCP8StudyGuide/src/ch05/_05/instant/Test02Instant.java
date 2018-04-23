package ch05._05.instant;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test02Instant {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 12, 27); // +1
		//LocalDate date2 = LocalDate.of(2015, 5, 27); // +2 GMT in May
		LocalTime time = LocalTime.of(14, 55, 00);
		ZoneId zone = ZoneId.of("Europe/Paris"); 
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant();
		// 2015–05–25T15:55:00Z
		System.out.println(zonedDateTime);
		// //
		// 2015–05–25T11:55–04:00[US/Eastern]
		System.out.println(instant);
		// //
		// 2015–05–25T15:55:00Z

		/*
		 * The Instant gets rid of the time zone and turns it into an Instant of
		 * time in GMT. You cannot convert a LocalDateTime to an Instant.
		 * Remember that an Instant is a point in time. A LocalDateTime does not
		 * contain a time zone, and it is therefore not universally recognized
		 * around the world as the same moment in time.
		 */

	}
}
