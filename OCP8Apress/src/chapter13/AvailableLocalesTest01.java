package chapter13;

import java.util.Arrays;
import java.util.Locale;

public class AvailableLocalesTest01 {

	public static void main(String[] args) {

		//
		Locale[] locales = Locale.getAvailableLocales();

		Arrays.stream(locales).forEach(l -> System.out.println(l + " " + l.getDisplayLanguage()));
		//
		System.out.println();
		System.out.println(Locale.getDefault());
	}

}
