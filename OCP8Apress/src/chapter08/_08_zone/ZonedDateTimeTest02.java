package chapter08._08_zone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest02 {

	public static void main(String[] args) {
		//
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
		// Combines this date-time with a time-zone to create a ZonedDateTime
		System.out.println(zonedDateTime);
	}
}
