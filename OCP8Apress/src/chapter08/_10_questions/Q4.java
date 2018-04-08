package chapter08._10_questions;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Q4 {

	public static void main(String[] args) {
		//
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE;
		LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY, 31);
		System.out.println(dateFormat.format(dateOfBirth));
		// Exception in thread "main" java.time.DateTimeException: Invalid date
		// 'FEBRUARY 31'
	}
}
