package ch23;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// in most of the United States , daylight savings time ends on November 5 , 2017 at 02.00 a.m
// and we repeat that hour. What is the output of the following ?

public class QX78 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2017, Month.NOVEMBER, 5);
		LocalTime localTime = LocalTime.of(1, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);

		for (int i = 0; i < 6; i++)
			z = z.plusHours(1);

		System.out.println(z.getHour()); //6
		
	}
}
