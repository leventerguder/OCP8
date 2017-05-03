package _09.date.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChroneUnitTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		// add 1 week
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek);

		// add 1 month

		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth);
		
		// add 1 year
		
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println(nextMonth);
		
	}
}
