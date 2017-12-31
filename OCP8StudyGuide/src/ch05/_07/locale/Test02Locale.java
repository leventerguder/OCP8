package ch05._07.locale;

import java.util.Locale;

public class Test02Locale {

	public static void main(String[] args) {
		Locale locale1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale locale2 = new Locale.Builder().setRegion("TR").setLanguage("tr").build();

		System.out.println(locale1);
		System.out.println(locale2);
	}
}
