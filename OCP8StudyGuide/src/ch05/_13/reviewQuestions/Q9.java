package ch05._13.reviewQuestions;

import java.time.LocalDate;
import java.time.Month;

public class Q9 {

	public static void main(String[] args) {
		//
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2); // WATCHOUT LocalDate is IMMUTABLE
		date.plusYears(3);
		//
		System.out.println(date);
		
	}
}
