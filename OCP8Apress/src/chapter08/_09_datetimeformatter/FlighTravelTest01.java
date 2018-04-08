package chapter08._09_datetimeformatter;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FlighTravelTest01 {

	public static void main(String[] args) {
		//
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyy hh.mm a");

		ZonedDateTime departureSingapore = ZonedDateTime.of(LocalDateTime.of(2018, Month.JANUARY, 1, 6, 0),
				ZoneId.of("Asia/Singapore"));

		ZonedDateTime sameInstantAtAuckLand = departureSingapore.withZoneSameInstant(ZoneId.of("Pacific/Auckland"));

		System.out.println("departure : " + departureSingapore);
		System.out.println("formatted : " + dateTimeFormatter.format(departureSingapore));
		System.out.println("formatted : " + dateTimeFormatter.format(sameInstantAtAuckLand));

		ZonedDateTime arrival = sameInstantAtAuckLand.plusHours(10);

		System.out.println("arrival time to Auckland : " + arrival);
		System.out.println("formatted : " + dateTimeFormatter.format(arrival));

	}
}
