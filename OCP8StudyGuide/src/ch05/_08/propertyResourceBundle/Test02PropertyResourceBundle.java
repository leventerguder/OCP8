package ch05._08.propertyResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test02PropertyResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch05._08.propertyResourceBundle.messages", new Locale("tr"));
		String helloMessage = rb.getString("hello");
		String welcomeMessage = rb.getString("welcome");
		String goodByMessage = rb.getString("goodBye");
		System.out.println(helloMessage + ", " + welcomeMessage+ " , " + goodByMessage);
	}
}
