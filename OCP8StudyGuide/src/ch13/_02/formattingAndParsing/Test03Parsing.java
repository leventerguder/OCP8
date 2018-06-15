package ch13._02.formattingAndParsing;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Test03Parsing {

	public static void main(String[] args) throws ParseException {

		DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String s = "01/31/1984";

		Date date = shortFormat.parse(s);
		DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println(fullFormat.format(date));

	}
}
