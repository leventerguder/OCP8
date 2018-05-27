package ch22.file;

import java.util.ListResourceBundle;

public class Buggy extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "wheels", "4" } };
	}

}
