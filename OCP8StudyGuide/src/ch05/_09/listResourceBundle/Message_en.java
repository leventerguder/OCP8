package ch05._09.listResourceBundle;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "hello", "Hello" }, { "welcome", "Welcome" }, { "goodBye", "Goodbye" } };
	}

}
