package ch17;

import java.time.LocalDate;
import java.time.Month;

public class Q6 {

	public static void main(String[] args) {
		int year = 1874;
		// int month = Month.MARCH; // compile error
		Month month = Month.MARCH;
		int day = 24;
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date.isBefore(LocalDate.now()));
	}
}
