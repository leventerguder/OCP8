package chapter13.propertyResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
	public static void main(String args[]) {
		Locale.setDefault(new Locale("tr","TR"));
		Locale currentLocale = Locale.getDefault();
		
		ResourceBundle resBundle = ResourceBundle.getBundle("chapter13.propertyResourceBundle.myResource", currentLocale);
		System.out.printf(resBundle.getString("hello.message"));
	}
}
