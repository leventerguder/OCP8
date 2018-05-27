package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX34 {

	// If the key red is in all three of these files, which file will the
	// following code use for the resource bundle?

	public static void main(String[] args) {
		
		Locale loc = new Locale("zh", "CN");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
		rb.getString("red");

		// A. Colors_en.properties (+)
		// B. Colors.properties
		// C. Red_en.properties
		// D. None of the above. It will throw a MissingResourceException.
	}
}

// Since a locale is passed when requesting the ResourceBundle ,that locale is used first when looking for bundles.
// Since there isnt a bundle for tha locale , Java checks for language zh.
// Next java checks the language of the default locale and finally finds a match in Colors_en.properties.