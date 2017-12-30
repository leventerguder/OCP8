package chapter13;

import java.util.Locale;

public class LocaleTest02 {

	public static void main(String[] args) {

		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.ENGLISH));
		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.ITALIAN));
		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.GERMANY));
	}
}
