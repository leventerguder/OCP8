package mock;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QX24 {

	public static void main(String[] args) {

		DateTimeFormatter fromDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		// PARSE_DATE
		LocalDate firstOct2015 = LocalDate.parse("01/10/2015", fromDateFormat);
		DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("dd/MMM/YY");
		System.out.println(firstOct2015.format(toDateFormat));
	}
}
