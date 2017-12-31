package ch05._11.formattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test03Parse {

	public static void main(String[] args) throws ParseException {
		//
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));
		
		// In the United States, a dot is part of a number and the number is
		// parsed how you might expect. France does not use a decimal point to
		// separate numbers. Java parses it as a formatting character, and it
		// stops looking at the rest of the number. The lesson is to make sure
		// that you parse using the right locale!
	}
}
