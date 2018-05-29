package ch23;

import java.util.*;

public class QX22 {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch23.QX22CountResource"); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//System.out.println(rb.getString("count") + " " + rb.getString("count"));
		System.out.println(rb.getObject("count") + " " + rb.getObject("count"));
	}
}
