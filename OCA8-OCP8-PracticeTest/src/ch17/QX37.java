package ch17;

import java.time.LocalDate;
import java.time.Month;

public class QX37 {

	// What is the output of the following?

	public static void main(String[] args) {
		//
		LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
		LocalDate date2 = date1.plusDays(2).minusDays(1).minusDays(1);
		System.out.println(date1.equals(date2));
		//
		System.out.println(date1);
		System.out.println(date2);
	}

}
