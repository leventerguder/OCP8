package chapter08._01_localdate;

import java.time.LocalDate;

public class LocalDateTest02 {

	public static void main(String[] args) {
		//
		LocalDate localDate1 = LocalDate.now();
		LocalDate next10Day = localDate1.plusDays(10);
		//
		System.out.println(localDate1);
		System.out.println(next10Day);
		
		LocalDate localDate2 = LocalDate.now();
		LocalDate plusMonthAndWeek = localDate2.plusMonths(2).plusWeeks(3);

		System.out.println(plusMonthAndWeek);
		
		// plus
		// plusDays
		// plusWeeks
		// plusMonths
		// plusYears
		// minusDays
		// minusWeeks
		// minusMonths
		// minusYears
	}
}
