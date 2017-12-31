package ch05._13.reviewQuestions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class QX14 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalDate date = LocalDate.of(2016, 3, 13);
		// LocalDate date = LocalDate.of(2016, 11, 6);
		// LocalDate date = LocalDate.of(2016, 11, 7);
		// LocalDate date = LocalDate.of(2017, 2, 29); //exception
		LocalTime time1 = LocalTime.of(2, 15);
		ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
	}
}
