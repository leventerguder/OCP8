package chapter08._08_zone;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest01 {

	public static void main(String[] args) {
		//
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		Instant instant = Instant.now();
		ZoneId myZone = ZoneId.systemDefault();

		ZonedDateTime zonedDateTime1 = ZonedDateTime.of(currentDate, currentTime, myZone);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(currentDateTime, myZone);
		ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(instant, myZone);
		
		System.out.println(zonedDateTime1);
		System.out.println(zonedDateTime2);
		System.out.println(zonedDateTime3);
		//
	}
}
// What if you want all three—date, time, and time zone—together? For that, you
// can use the ZonedDateTime class: