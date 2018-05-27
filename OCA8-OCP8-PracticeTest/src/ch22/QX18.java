package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX18 {

	// If the key purple is in all four of these files, which file will the
	// following code use for the resource bundle?

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Colors");
		rb.getString("purple");
	}

}

// A. Colors_en.class (+)
// B. Colors_en.properties
// C. Colors_US.class
// D. Colors_US.properties

// Java starts out by looking for a Java file with the most specific match ,
// whic is language and country code.
// Since the is no such matching file , it drops the country code and looks for
// a match by language code.

// 1 - Colors_en.class
// 2 - Colors_en.properties

// C and D would never be considered! as a locale doesnt just have a country code.