package ch05._07.locale;

import java.util.Locale;

public class Test03Locale {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		//
		Locale locale = new Locale("tr","TR");
		Locale.setDefault(locale);
		//
		System.out.println(Locale.getDefault());
	}
}
