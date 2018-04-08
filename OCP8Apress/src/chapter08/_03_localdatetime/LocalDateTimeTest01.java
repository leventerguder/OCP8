package chapter08._03_localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

	public static void main(String[] args) {
		//
		LocalDateTime currDateTime = LocalDateTime.now();

		// public static LocalDateTime of(LocalDate date, LocalTime time) {

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
		//
		// public static LocalDateTime of(int year, Month month, int dayOfMonth,
		// int hour, int minute, int second)
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, Month.JUNE, 18, 20, 45, 50);

		System.out.println(currDateTime);
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
		
		// java.time.LocalDateTime represent both date and time without time zones.
	}
}

// In this output, note that the character T stands for time, and it
// separates the date and time components.