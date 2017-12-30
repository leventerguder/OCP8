package ch05._01.creatingDateAndTime;

import java.time.LocalDate;

public class Test01LocalDate2 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.ofYearDay(2017, 78);
		LocalDate date2 = LocalDate.ofEpochDay(1071);
		//
		System.out.println(date1);
		System.out.println(date2);
	}
}
