package chapter13.listResourceBundle;

import java.util.ResourceBundle;

public class ResBundleTest {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("chapter13.listResourceBundle.ResBundle");
		// if the property file has same name with java class , the java class
		// is first!
		System.out.println(rb.getString("hello.message"));
		// //java.util.MissingResourceException
		System.out.println(rb.getClass());
	}
}
