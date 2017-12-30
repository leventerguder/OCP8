package chapter13.candidate;

import java.util.ListResourceBundle;

//Italian version
public class Candidate_it_IT extends ListResourceBundle {
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = 
		    { { "MovieName", "Che Bella Giornata" }, 
		    { "GrossRevenue", 43000000L },
			{ "Year",  2011 } };
}
