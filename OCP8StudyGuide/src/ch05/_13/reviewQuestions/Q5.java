package ch05._13.reviewQuestions;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q5 {

	public static void main(String[] args) {
		Locale fr = new Locale("fr");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle b = ResourceBundle.getBundle("ch05._13.reviewQuestions.Dolphins", fr);
				
		System.out.println(b.getString("name"));
		System.out.println(b.getString("age"));
	}
}

// Dolphins.properties
// name=The Dolphin
// age=0
//
// Dolphins_en.properties
// name=Dolly
// age=4
//
// Dolphins_fr.properties
// name=Dolly
//
// 5: Locale fr = new Locale("fr");
// 6: Locale.setDefault(new Locale("en", "US"));
// 7: ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
// 8: b.getString("name");
// 9: b.getString("age");

// --> Dolly (Dolphins_fr.properties)
// --> 0 (Dolphins.properties)
// Once a bundle is chosen, only resources in that hierarchy are allowed.