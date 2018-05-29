package ch23;

import java.util.ListResourceBundle;

public class QX22CountResource extends ListResourceBundle {
	private int count = 0;

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "count", ++count } };
	}

}