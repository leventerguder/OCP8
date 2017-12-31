package ch05._09.listResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test01ListResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch05._09.listResourceBundle.Message", new Locale("en", "US"));
		String helloMessage = rb.getString("hello");
		Object welcomeMessage = rb.getObject("welcome");
		//
		System.out.println(helloMessage);
		System.out.println(welcomeMessage);
	}
}
