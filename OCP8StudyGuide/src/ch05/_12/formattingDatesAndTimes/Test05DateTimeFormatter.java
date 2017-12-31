package ch05._12.formattingDatesAndTimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test05DateTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd , yyyy , hh:mm");
		System.out.println(dtf.format(dateTime));

		dtf = DateTimeFormatter.ofPattern("MMM dd , yyyy , hh:mm");
		System.out.println(dtf.format(dateTime));

		dtf = DateTimeFormatter.ofPattern("MM/dd , yyyy , hh:mm");
		System.out.println(dtf.format(dateTime));
	}
}

/*
 * MMMM M represents the month. The more Ms you have, the more verbose the Java
 * output. For example, M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM
 * outputs January.
 */
