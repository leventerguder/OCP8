package ch23;

import java.util.Properties;

public class QX40 {

	public static void main(String[] args) {
		Properties props = new Properties();
//		System.out.print(props.getDefaultProperty("mystery", "?")); //compile error
//		System.out.print(props.getDefaultProperty("more", "?")); //compile error
	}
}
// Given this property file used to load the Properties object props and this
// code snippet, what is the output?

// mystery=bag 
// type=paper