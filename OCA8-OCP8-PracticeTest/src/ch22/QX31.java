package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX31 {

	public static void main(String[] args) {
		// Given the following snippets of resource bundles from when we
		// compiled the application, what is the result of the following?

		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("ch22.file.Buggy");
		System.out.println(rb.getString("wheels"));
		
		// Since no locale is pecified , the code tries to find a bundle matching the default locale.
	}
}

//
//B. Since no locale is specified, the code tries to find a bundle matching the default
//locale. While none of the resource bundles match English United States, two do match
//the language English. 

// The Java class one is used since it is present. Since the Java
//resource bundle for English doesn’t have a key wheels, we go up to the parent resource
//bundle. The default Java resource bundle does have the key wheels with the value 4, so
//Option B is correct.