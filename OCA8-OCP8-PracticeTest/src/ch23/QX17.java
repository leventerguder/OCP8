package ch23;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class QX17 {

	public static void main(String[] args) {

		// Fill in the blank so this code prints -1.
		//
		LocalDate xmas = LocalDate.of(2017, 12, 25);
		LocalDate blackFriday = LocalDate.of(2017, 11, 24);
		long monthsLeft = ChronoUnit.MONTHS.between(xmas, blackFriday);
		System.out.println(monthsLeft);

	}

}
