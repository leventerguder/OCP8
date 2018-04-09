package chapter13;

import java.util.Locale;

public class LocaleTest03 {

	public static void main(String[] args) {

		Locale locale1 = new Locale("it", "IT");
		Locale locale2 = Locale.forLanguageTag("it");
		Locale locale3 = new Locale.Builder().setLanguage("it").build();
		Locale locale4 = Locale.ITALIAN;
		Locale locale5 = Locale.ITALY;

		System.out.println(locale1);
		System.out.println(locale2);
		System.out.println(locale3);
		System.out.println(locale4);
		System.out.println(locale5);

	}
}
