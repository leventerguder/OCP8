package chapter08._05_period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {

	// The java.time.Period class is used to measure an amount of time in terms
	// of years, months, and days.

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2015, Month.JULY, 18);
		LocalDate localDate2 = LocalDate.now();
		//
		Period betweenDate = Period.between(localDate1, localDate2);
		System.out.println(betweenDate);
		System.out.println(betweenDate.getYears());
		System.out.println(betweenDate.getMonths());
		System.out.println(betweenDate.getDays());
		
	}

}
