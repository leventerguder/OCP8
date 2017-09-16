package chapter08._08_zone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest01 {
	
	public static void main(String[] args) {
		//
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime , myZone);
		System.out.println(zonedDateTime);
	}
}
// What if you want all three—date, time, and time zone—together? For that, you
// can use the ZonedDateTime class: