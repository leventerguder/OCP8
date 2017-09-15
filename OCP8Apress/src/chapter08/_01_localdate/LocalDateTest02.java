package chapter08._01_localdate;

import java.time.LocalDate;

public class LocalDateTest02 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate next10Day = today.plusDays(10);
		//
		System.out.println(today);
		System.out.println(next10Day);

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
