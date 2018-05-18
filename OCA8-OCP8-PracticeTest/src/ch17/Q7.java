package ch17;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Q7 {

	// Which correctly fills in the blank to print 2017-01-15?
	// LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
	// DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
	// System.out.println( );
	// I. f.format(hatDay)
	// II. f.formatDate(hatDay)
	// III. hatDay.format(f)

	public static void main(String[] args) {
		LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
		DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
		System.out.println(f.format(hatDay));
		System.out.println(hatDay.format(f));
	}

}
