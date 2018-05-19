package ch17;

import java.time.LocalDate;
import java.time.Month;

public class QX26 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
		LocalDate date2 = LocalDate.of(2017, Month.FEBRUARY, 31);
		System.out.println(date1.equals(date2));
		// D. The code compiles but throws an exception at runtime.
		// java.time.DateTimeException: Invalid date 'FEBRUARY 31'
	}
}
