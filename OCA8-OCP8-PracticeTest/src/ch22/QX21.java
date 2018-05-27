package ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

class Type { // must extends ListResourceBundle
	// java.util.MissingResourceException:
	protected Object[][] getContents() {
		return new Object[][] { { "keys", new ArrayList<String>() } };
	}
}

public class QX21 {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("keyboard.Type");
		List<String> keys = (List) rb.getObject("keys");
		keys.add("q");
		keys.add("w");
		keys.add("e");
		keys.add("r");
		keys.add("t");
		keys.add("y");
		System.out.println(((List) rb.getObject("keys")).size());

	}
}