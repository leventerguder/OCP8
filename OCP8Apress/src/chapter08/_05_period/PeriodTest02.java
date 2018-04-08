package chapter08._05_period;

import java.time.Period;

public class PeriodTest02 {

	public static void main(String[] args) {
		//
		Period p1 = Period.of(1, 4, 20);
		System.out.println(p1);

		Period p2 = Period.ofDays(14);
		System.out.println(p2);

		Period p3 = Period.ofWeeks(2);
		System.out.println(p3);

		Period p4 = Period.ofMonths(2);
		System.out.println(p4);

		Period p5 = Period.ofYears(2);
		System.out.println(p5);

		Period p6 = Period.parse("P4Y6M15D");
		System.out.println(p6);
	}
}
