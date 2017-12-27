package ch05._03.periods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test04Period {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		//
		Period period = Period.ofMonths(1);
		System.out.println(period); // P1M

		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		System.out.println(time.plus(period));// UnsupportedTemporalTypeException
	}
}
