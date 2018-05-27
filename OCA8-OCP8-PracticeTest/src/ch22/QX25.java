package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX25 {

	public static void main(String[] args) {
		// Given the four properties files in question 24, what does this code
		// print?
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("ch22.file.Cars", new Locale("fr", "CA"));
		System.out.println(rb.getString("engine") + " " + rb.getString("horses"));
	}
}
// The getBundle() method matches Cars_fr.properties. Since the requested locale
// of French Canada is not available, it uses the language-specific locale of
// French.

// The engine key is in that properties file directly, so moteur is retrieved as
// the value. However, we have a problem getting the horses key. It is not in
// the hierarchy of Cars_fr.properties.
// It is in the English properties file, but Java cannot look at the default
// locale if it found a match with the requested locale.

//D. The code throws an exception at runtime.