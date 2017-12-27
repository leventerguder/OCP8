package ch05._03.periods;

import java.time.Period;

public class Test03Period {

	public static void main(String[] args) {
		Period annually = Period.ofYears(1);
		Period quarterly = Period.ofMonths(3);
		Period _12Months = Period.ofMonths(12); // P12M
		Period _21Days = Period.ofDays(21);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyFourWeeks = Period.ofWeeks(4);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndAWeek = Period.of(1, 0, 7);

		Period wrong = Period.ofYears(1).ofWeeks(1);

		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(_12Months);
		System.out.println(_21Days);
		System.out.println(everyThreeWeeks);
		System.out.println(everyFourWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndAWeek);
		System.out.println(wrong);

		// Y
		// M
		// D
		// Week -> Days convert
	}
}
