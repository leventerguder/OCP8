package chapter08._01_localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest05 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		//
		int dayOfMonth1 = date.getDayOfMonth();
		int dayOfMonth2 = date.get(ChronoField.DAY_OF_MONTH);

		System.out.println("dayOfMonth : " + dayOfMonth1 + " " + dayOfMonth2);
		//
		DayOfWeek dayOfWeek1 = date.getDayOfWeek();
		int dayOfWeek2 = date.get(ChronoField.DAY_OF_WEEK);
		System.out.println("dayOfWeek : " + dayOfWeek1 + " " + dayOfWeek2);
		//
		int dayOfYear1 = date.getDayOfYear();
		int dayOfYear2 = date.get(ChronoField.DAY_OF_YEAR);
		System.out.println("dayOfYear : " + dayOfYear1 + " " + dayOfYear2);
		//
		Month month1 = date.getMonth();
		int month2 = date.get(ChronoField.MONTH_OF_YEAR);
		int month3 = date.getMonthValue();
		System.out.println("month : " + month1 + " " + month2 + " " + month3);
		//

	}
}
