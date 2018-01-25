package mock;

import java.util.ListResourceBundle;

public class QX20 {

}

// In a class that extends ListResourceBundle, which one of the following
// method definitions correctly overrides the getContents() method of the base
// class?

// ListResourceBundle # abstract protected Object[][] getContents();

class ListResourceBundleSub extends ListResourceBundle {
	@Override
	public Object[][] getContents() {
		return new Object[][] { { "1", "Uno" }, { "2", "Duo" }, { "3", "Trie" } };
	}
}
