package ch22;

import java.util.Locale;

public class QX22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.KOREAN);
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("en", "AU"));
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("EN"));
		System.out.println(Locale.getDefault());
		
		// How many lines does the following print out?
		// D. All three
	}

}
