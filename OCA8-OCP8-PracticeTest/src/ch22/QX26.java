package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX26 {

	public static void main(String[] args) {

		// Given the four properties files in question 24, what does this code
		// print?

		Locale.setDefault(new Locale("fr", "CA"));
		ResourceBundle rb = ResourceBundle.getBundle("ch22.file.Cars", new Locale("en", "CA"));
		System.out.println(rb.getString("engine") + " " + rb.getString("horses"));
		
		//
		
	}
}

// The getBundle() method matches Cars_en.properties. Since the requested locale of
// English Canada is not available, it uses the language-specific locale of English.
