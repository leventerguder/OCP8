package ch17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class QX33 {

	public static void main(String[] args) {

		LocalDate xmas = LocalDate.of(2017, 12, 25);
		LocalDate blackFriday = LocalDate.of(2017, 11, 24);

		long shoppingDaysLeft = ChronoUnit.DAYS.between(blackFriday, xmas);
		// public enum ChronoUnit implements TemporalUnit {

		long shoppingDaysLeft2 = blackFriday.until(xmas, ChronoUnit.DAYS);
		
		System.out.println(shoppingDaysLeft);
		System.out.println(shoppingDaysLeft2);
	}
}
