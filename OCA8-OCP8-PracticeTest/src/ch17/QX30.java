package ch17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QX30 {

	public static void main(String[] args) {
		//
		LocalDate polarBearDay = LocalDate.of(2017, 2, 27);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Holiday: yyyy dd MMM");
		System.out.println(polarBearDay.format(formatter));
		// D. The code compiles but throws an exception at runtime.
		// java.lang.IllegalArgumentException: Unknown pattern letter: o
	}
}
