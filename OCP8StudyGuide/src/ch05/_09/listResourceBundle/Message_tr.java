package ch05._09.listResourceBundle;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "hello", "Merhaba" }, { "welcome", "Hos geldiniz." }, { "goodBye", "Gule gule" } };
	}

}
