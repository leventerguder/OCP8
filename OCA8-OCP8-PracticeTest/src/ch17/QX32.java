package ch17;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class QX32 {

	public static void main(String[] args) {

		LocalDate waffleDay = LocalDate.of(2017, Month.MARCH, 25);
		Period period = Period.ofYears(1).ofMonths(6).ofDays(3); // Watch out!
		LocalDate later = waffleDay.plus(period);
		later.plusDays(1); // Watch out , immutable!

		LocalDate thisOne = LocalDate.of(2018, Month.SEPTEMBER, 28);
		LocalDate thatOne = LocalDate.of(2018, Month.SEPTEMBER, 29);

		System.out.println(later.isBefore(thisOne) + " " + later.isBefore(thatOne));
		//true true
		System.out.println(waffleDay);
	}
}
