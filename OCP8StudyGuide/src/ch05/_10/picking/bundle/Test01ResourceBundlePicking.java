package ch05._10.picking.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test01ResourceBundlePicking {

	public static void main(String[] args) {
		//
		Locale locale = new Locale("en", "CA");
		//
		ResourceBundle rb = ResourceBundle.getBundle("ch05._10.picking.bundle.Zoo", locale);
		System.out.println(rb.getString("hello")); // Hello
		// Zoo_en_CA doesnt have the "hello" , Zoo_en will be used.

		System.out.println(rb.getString("name"));
		// Zoo_en_CA doesnt have the "name" , Zoo_en next , Zoo_en also doesnt
		// have.
		// Zoo.properties is the next. //Vancouver Zoo

		System.out.println(rb.getString("open"));
		// Zoo_en_CA doesnt have the "open"
		// Zoo_en has

		System.out.println(rb.getString("visitor"));
		// Zoo_en_CA has "visitor"
	}
}
