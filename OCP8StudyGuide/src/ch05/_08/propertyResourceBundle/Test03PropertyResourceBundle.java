package ch05._08.propertyResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Test03PropertyResourceBundle {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("ch05._08.propertyResourceBundle.messages", locale);

		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
	}
}
