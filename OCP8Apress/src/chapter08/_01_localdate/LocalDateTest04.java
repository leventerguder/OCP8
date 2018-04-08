package chapter08._01_localdate;

import java.time.LocalDate;

public class LocalDateTest04 {

	public static void main(String[] args) {
		//
		LocalDate date78 = LocalDate.ofYearDay(2017, 78);
		System.out.println(date78);

		//
		LocalDate epochDayAfter1000 = LocalDate.ofEpochDay(1000);
		System.out.println(epochDayAfter1000);
		
	}
}
