package ch05._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class Test01ManipulateDate {

	public static void main(String[] args) {
		//
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		
		System.out.println(date);
		
		date = date.plusDays(2);
		System.out.println(date);
		
		date = date.plusWeeks(1);
		System.out.println(date);
		
		date = date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(5);
		System.out.println(date);
	}
}
