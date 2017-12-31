package ch05._07.locale;

import java.util.Locale;

public class Test01Locale {

	public static void main(String[] args) {
		// Internationalization is the process of designing your program so it
		// can be adapted.

		// Localization means actually supporting multiple locales.

		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		//Category used to represent the default locale for formatting dates, numbers, and/or currencies.
		Locale locale2 = Locale.getDefault(Locale.Category.FORMAT);
		System.out.println(locale2);

		// US // can have a language without a country, but not the reverse
		// enUS // missing underscore
		// US_en // the country and language are reversed
		// EN // language must be lowercase

		// Pay attention to uppercase/lowercase and the underscore. !

		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE
	}
}
