package ch05._08.propertyResourceBundle;

import java.util.ResourceBundle;

public class Test01PropertyResourceBundle {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch05._08.propertyResourceBundle.messages");
		String helloMessage = rb.getString("hello");
		String welcomeMessage = rb.getString("welcome");
		String goodByMessage = rb.getString("goodBye");
		System.out.println(helloMessage + ", " + welcomeMessage + " , " + goodByMessage);
		System.out.println(rb.getClass());
		// java.util.PropertyResourceBundle
	}
}

// Spaces at the beginning of a line are ignored.
// Spaces at the end of a line are not ignored.