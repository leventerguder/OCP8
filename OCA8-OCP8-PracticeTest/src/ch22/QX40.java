package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX40 {

	public static void main(String[] args) {

		// If the key red is in all three of these files, which file will the
		// following code use for the resource bundle?

		// A. Colors_EN.properties
		// B. Colors_ZH.properties
		// C. Red_EN.properties
		// D. None of the above. It will throw a MissingResourceException. (+)
		
		Locale loc = new Locale("zh", "CN");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
		rb.getString("red");
	}
}

