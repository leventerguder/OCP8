package ch23;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class QX32 {

	public static void main(String[] args) {

		LocalDate trainDay = LocalDate.of(2017, 5, 13);
		LocalTime time = LocalTime.of(10, 0);
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.of(trainDay, time, zone);
		Instant instant = zdt.toInstant();

		// instant = instant.plus(1, ChronoUnit.YEARS); 
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Years
		System.out.println(instant);
	}
}
