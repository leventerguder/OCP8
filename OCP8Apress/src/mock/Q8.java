package mock;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Q8 {

	public static void main(String[] args) {

		LocalDate joiningDate = LocalDate.of(2014, Month.SEPTEMBER, 20);
		LocalDate now = LocalDate.of(2015, Month.OCTOBER, 20);

		int years = Period.between(joiningDate, now).getYears();
		// GET_YEARS
		System.out.println(years);
	}
}
