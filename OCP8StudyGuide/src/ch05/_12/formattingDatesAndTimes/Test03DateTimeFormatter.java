package ch05._12.formattingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test03DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 11, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		//

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(time));
		System.out.println(shortDateTime.format(dateTime));
		// System.out.println(shortDateTime.format(date));
		// java.time.temporal.UnsupportedTemporalTypeException

		System.out.println(time.format(shortDateTime));
		System.out.println(dateTime.format(shortDateTime));
		// System.out.println(date.format(shortDateTime));
		// java.time.temporal.UnsupportedTemporalTypeException
	}
}
