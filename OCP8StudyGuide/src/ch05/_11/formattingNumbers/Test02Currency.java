package ch05._11.formattingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class Test02Currency {

	public static void main(String[] args) {
		double price = 48;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(price));

		// return getInstance(Locale.getDefault(Locale.Category.FORMAT),
		// CURRENCYSTYLE);
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		System.out.println(nf2.format(price));

	}
}
