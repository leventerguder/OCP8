package chapter08._05_period;

import java.time.Period;

public class PeriodTest03 {

	public static void main(String[] args) {
		//
		Period period1 = Period.ofDays(10);
		period1 = period1.plusDays(22);
		period1 = period1.plusMonths(1);
		period1 = period1.plusYears(2);
		System.out.println(period1);
	}
}
