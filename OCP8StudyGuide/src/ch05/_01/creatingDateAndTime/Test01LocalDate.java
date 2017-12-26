package ch05._01.creatingDateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class Test01LocalDate {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate date1 = LocalDate.of(2017, 12, 26);
		LocalDate date2 = LocalDate.of(2017, Month.DECEMBER, 26);
		//
		System.out.println(now);
		System.out.println(date1);
		System.out.println(date2);
	}
}
