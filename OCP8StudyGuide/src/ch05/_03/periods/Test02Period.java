package ch05._03.periods;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test02Period {

	public static void main(String[] args) {
		LocalDate startDateInclusive = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate endDateExclusive = LocalDate.of(2015, Month.MARCH, 30);
		//
		Period period = Period.between(startDateInclusive, endDateExclusive);
		System.out.println(period);
		// P2M29D
	}
}
