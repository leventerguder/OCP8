package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX28 {

	// If the key red is in all four of these files, which file will the
	// following code use for the resource bundle?

	// A. Colors_CN.properties
	// B. Colors_en.properties
	// C. Colors_US.properties
	// D. Colors_zh.properties

	public static void main(String[] args) {
		//
		Locale loc = new Locale("zh", "CN");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
		rb.getString("red");
	}
}

// 1 - zh_CN
// 2 - zh
// 3 - en
// A and C would not be considered !

// Since a Locale is passed when requesting the ResourceBundle , that Locale is used first when looking for bundles.
// Since there isnt a bundle called Colors_zh_CN.properties , Java goes on to check for the language.