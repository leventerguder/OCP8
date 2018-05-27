package ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class QX36 extends ListResourceBundle {

	protected Object[][] getContents() {
		return new Object[][] { { "keys", new ArrayList<String>() } };
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch22.QX36");
		List<String> keys = (List) rb.getObject("keys");
		keys.add("q");
		keys.add("w");
		keys.add("e");
		keys.add("r");
		keys.add("t");
		keys.add("y");
		System.out.println(((List) rb.getObject("keys")).size());
		// B. 6
	}
}
