package ch13._08.reviewQuestions;

import java.text.DecimalFormat;
import java.util.Locale;

public class QX12 {

	// Given that Germany uses a comma and the United States uses a period for
	// the decimal point, what is the output of the following code?

	public static void main(String[] args) {
		Locale.setDefault(Locale.GERMANY);
		DecimalFormat df = new DecimalFormat("#00.00##");
		double pi = 3.141592653;
		System.out.println(df.format(pi));
		//03,1416
		
		// The 0 means a mandatory position and the # means an optional position.
	}
}
