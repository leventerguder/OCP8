package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX32 {
	// Given the snippets of resource bundles in question 31 from when we
	// compiled the application, what is the result of the following?

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en"));
		ResourceBundle rb = ResourceBundle.getBundle("ch22.file.Buggy");
		System.out.println(rb.getString("color"));

		// Since no locale is specified, the code tries to find a bundle matching the default locale
		// Two resource bundles match the language English,
		// The Java class one is used sinc it is present.
		// However it does not contain a key color nor does its parent.
		
		//## Java does not allow looking in a properties file resource bundle once it has matched a Java class resource bundle.
		// Therefore it throws a MissingResouceBundleException

	}
}
