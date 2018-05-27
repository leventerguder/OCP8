package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX11 {

	public static void main(String[] args) {

		// If the key purple is in all four of these files, which file will the
		// following code use for the resource bundle?

		// A. Colors.class
		// B. Colors.properties
		// C. Colors_en_US.class (+)
		// D. Colors_en_US.properties

		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Colors");
		rb.getString("purple");

		// Java starts out by looking for a Java file with the most specific
		// match , which is language and country code.
		// Since this is happening at runtime , it is looking for the corresponding file with a .class extension.
		
		// 1 - Colors_en_US.class
		// 2 - Colors_en_US.properties
		// 3 - Colors.class
		// 4 - Colors.properties
	}

}
