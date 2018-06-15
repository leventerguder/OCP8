package ch13._08.reviewQuestions;

import java.util.Locale;
import java.text.NumberFormat;

public class QX11 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		String value = "444,33";
		//System.out.println(nf.parse(value)); //checked exception!

	}
}
