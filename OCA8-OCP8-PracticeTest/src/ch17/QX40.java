package ch17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class QX40 {

	// Daylight savings time ends on November 5, 2017 at 2 a.m. when we repeat
	// the hour. Suppose we have a ZonedDateTime that outputs
	// 2017-11-05T01:00-04:00[America/ New_York] when calling toString(). What
	// is a possible value of the ZonedDateTime obtained by adding an hour to
	// this value?

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, 11, 5);
		LocalTime localTime = LocalTime.of(1,0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
		Duration duration = Duration.ofHours(1);
		ZonedDateTime later = z.plus(duration);
		
		System.out.println(z);
		System.out.println(later);
	}

}

//2017-11-05T01:00-04:00[America/New_York]
//2017-11-05T01:00-05:00[America/New_York]
