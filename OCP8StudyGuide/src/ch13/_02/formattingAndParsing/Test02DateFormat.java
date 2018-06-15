package ch13._02.formattingAndParsing;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test02DateFormat {

	//
	public static void main(String[] args) {
		DateFormat.getDateInstance();
		DateFormat.getTimeInstance();
		DateFormat.getDateTimeInstance();

		DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat m = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat l = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		Date d = new GregorianCalendar(2015, Calendar.JULY, 4).getTime();
		System.out.println(s.format(d)); // 7/4/15
		System.out.println(m.format(d));
		System.out.println(l.format(d));
		System.out.println(f.format(d));

		DateFormat dtf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL);
		System.out.println(dtf.format(d));

		DateFormat de = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, Locale.GERMANY);
		System.out.println(de.format(d));
	}
}
