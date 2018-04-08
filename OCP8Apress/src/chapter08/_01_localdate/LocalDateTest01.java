package chapter08._01_localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {

	public static void main(String[] args) {
		// The Java 8 date and time API uses ISO 8601 as the default calendar
		// format.

		LocalDate today = LocalDate.now();
		System.out.println(today);

		// The LocalDate.now() method gets the current date using the system
		// clock, based on the default time zone.

		// public static LocalDate of(int year, int month, int dayOfMonth) {
		LocalDate localDate1 = LocalDate.of(2018, 1, 20);

		// public static LocalDate of(int year, Month month, int dayOfMonth) {
		LocalDate localDate2 = LocalDate.of(2018, Month.JUNE, 18);

		System.out.println("today : " + today);
		System.out.println("localDate1 : " + localDate1);
		System.out.println("localDate2 : " + localDate2);

		// LocalDate invalidDate = LocalDate.of(2018, Month.FEBRUARY, 30);
		//java.time.DateTimeException: Invalid date 'FEBRUARY 30'

	}
}
