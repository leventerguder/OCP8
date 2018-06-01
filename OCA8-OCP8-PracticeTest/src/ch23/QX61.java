package ch23;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX61 {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("ja"));
		ResourceBundle rb = ResourceBundle.getBundle("ch23.container");

		String name = rb.getString("name"); // r1
		String type = rb.getString("type"); // Line r2 throws an exception.
	}
}

// Given the following two property files in the pod package, what does the
// following class output?

// pod.container.properties
// name=generic
// number=2
// pod.container_en.properties
// name=Docker
// type=container