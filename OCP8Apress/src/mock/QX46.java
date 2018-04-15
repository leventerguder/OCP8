package mock;

import java.util.*;

class ResourceBundle_it_IT extends ListResourceBundle {
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = { { "1", "Uno" }, { "2", "Duo" }, { "3", "Trie" }, };

}

public class QX46 {
	public static void main(String args[]) {
		ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", new Locale("it", "IT", ""));
		System.out.println(resBundle.getObject(new Integer(1).toString())); // MissingResourceException
	}
}
