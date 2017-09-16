package chapter08._09_datetimeformatter;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FlighTravelTest01 {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyy hh.mm a");

		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2018, Month.JANUARY, 1, 6, 0),
				ZoneId.of("Asia/Singapore"));
		
		System.out.println(departure);
		System.out.println(dateTimeFormatter.format(departure));
		//
		ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10);
		
		System.out.println(arrival);
		System.out.println(dateTimeFormatter.format(arrival));
		
	}
}
