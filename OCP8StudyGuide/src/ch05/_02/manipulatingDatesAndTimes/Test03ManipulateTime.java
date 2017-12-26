package ch05._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test03ManipulateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime ldt = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(ldt);
	}
}
