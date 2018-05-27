package ch22;

import java.util.Locale;
import java.util.ResourceBundle;

public class QX39 {

	// Given the following two properties files in the pod package, what does
	// the following class output?

	// pod.container.properties

	// name=generic
	// number=2

	// pod.container_en.properties
	// name=Docker
	// type=container

	public static void main(String[] args) {
		//
		Locale.setDefault(new Locale("en"));
		ResourceBundle rb = ResourceBundle.getBundle("pod.container");
		String name = rb.getString("name");
		String type = rb.getString("type");
		System.out.println(name + " " + type);
		
		
	}
}
