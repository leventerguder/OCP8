package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX33 {

	// Given the snippets of resource bundles in question 31 from when we
	// compiled the application, what is the result of the following?

	public static void main(String[] args) {
		Locale.setDefault(new Locale("zh"));
		ResourceBundle rb = ResourceBundle.getBundle("Buggy");
		System.out.println(rb.getString("wheels"));
		
		// B. 4
	}
}

// Since no locale is specified , the code tries to find a bundle matching the default locale.
// None of the resource bundles match the language so the default resource bundle is used.
// The default Java resource bundle is used.
