package ch17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class QX34 {

	private static String formatMe(LocalDate obj) {
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		return f.format(obj);
	}

	private static String formatMe(LocalTime obj) {
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		return f.format(obj);
	}

	private static String formatMe(ZonedDateTime obj) {
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		return f.format(obj);
	}
	 
	// How many of these classes cause a compiler error when filling in the
	// blank: LocalDate,
	// LocalDateTime, LocalTime, ZonedDateTime?
	// A. None
}
