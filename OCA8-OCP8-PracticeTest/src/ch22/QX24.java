package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX24 {

	public static void main(String[] args) {
		//
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("ch22.file.Cars", new Locale("fr", "FR"));
		System.out.println(rb.getString("country") + " " + rb.getString("engine"));
		
		// the getBundle() method matcher Cars_fr_FR.properties since that is the requested locale.
		// The country key is in that properties file directly.
		// The engine key is not , so java looks higher up in the hierarchy and finds it in the language specicif Cars_fr.properties
		
		// B. France moteur
	}
}

// Cars_en.properties
// engine=engine 
// horses=241
//
// Cars_fr.properties
// engine=moteur
//
// Cars_en_US.properties
// country=US
//
// Cars_fr_FR.properties
// country=France