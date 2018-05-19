package ch17;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class QX38 {

	public static void main(String[] args) {
		//
		LocalDate date = LocalDate.of(2017, 5, 13);
		LocalTime time = LocalTime.of(10, 0);
		LocalDateTime trainDay = LocalDateTime.of(date, time);

//		Instant instant = trainDay.toInstant(); //compile error
//		instant = instant.plus(1, ChronoUnit.DAYS);
//		System.out.println(instant);
	}
}
