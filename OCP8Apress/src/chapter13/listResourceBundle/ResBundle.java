package chapter13.listResourceBundle;

import java.util.ListResourceBundle;

//default US English version
public class ResBundle extends ListResourceBundle {
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = 
			{ { "MovieName", "Avatar" }, 
			{ "GrossRevenue", (Long) 2782275172L },
			{ "Year", (Integer) 2009 } };
}
