package ch05._11.formattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;

public class Test04Parse {

	public static void main(String[] args) throws ParseException {
		// The parse method parses only the beginning of a string
		// After it reaches a character that cannot be parsed, the parsing stops
		// and the value is returned.
		NumberFormat nf = NumberFormat.getInstance();
		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";
		System.out.println(nf.parse(one)); // 456
		System.out.println(nf.parse(two)); // -2.5165
		System.out.println(nf.parse(three));// throws ParseException
	}
}
