package chapter08._09_datetimeformatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {

	public static void main(String[] args) {
		//
		LocalTime weekupTime = LocalTime.of(6, 15, 00);
		System.out.println(DateTimeFormatter.ISO_TIME.format(weekupTime));

		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
		System.out.println(customFormat.format(LocalDate.of(2018, Month.JANUARY, 01)));
	}
}
