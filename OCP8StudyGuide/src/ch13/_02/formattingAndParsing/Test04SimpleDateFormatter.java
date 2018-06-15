package ch13._02.formattingAndParsing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04SimpleDateFormatter {

	// MMMM M represent the month.
	// dd d represent the day in the month.
	// yyyy y represent the year
	// hh h represent hour
	// mm m represent minute
	// ss s represent second

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat f1 = new SimpleDateFormat("MM dd yyyy hh:mm:ss");
		SimpleDateFormat f2 = new SimpleDateFormat("MMMM yyyy");
		SimpleDateFormat f3 = new SimpleDateFormat("hh");

		Date date = f1.parse("01 26 2016 01:22:33");
		System.out.println(f2.format(date));
		System.out.println(f3.format(date));
	}
}
