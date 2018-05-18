package ch17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q9 {

	// Given that daylight savings time starts on March 12, 2017, at 2 a.m. and
	// clocks jump from 1:59 a.m. to 03:00 a.m., which of the following can fill in
	// the blank so the code doesn’t throw an exception?

	public static void main(String[] args) {
		//
		LocalDate localDate = LocalDate.of(2017, 3, 12);
		LocalTime localTime = LocalTime.of(2, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);

		System.out.println(z);
		// 2017-03-12T03:00-04:00[America/New_York]

		LocalTime localTime2 = LocalTime.of(3, 0);
		System.out.println(ZonedDateTime.of(localDate, localTime2, zone));
		// 2017-03-12T03:00-04:00[America/New_York]

	}

	// C. Either of the above will run without throwing an exception.
}
