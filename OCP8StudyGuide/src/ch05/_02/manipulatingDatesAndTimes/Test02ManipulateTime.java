package ch05._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test02ManipulateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime ldt = LocalDateTime.of(date, time);
		System.out.println(ldt);
		//
		
		time = time.minusHours(10);
		time = time.minusSeconds(55);
		System.out.println(time);
		
		ldt = ldt.minusDays(1);
		System.out.println(ldt);
		
		ldt = ldt.minusHours(10);
		System.out.println(ldt);
		
		ldt = ldt.minusSeconds(30);
		System.out.println(ldt);
	}
}
