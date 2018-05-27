package ch22;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class QX38 extends ListResourceBundle {
	private int count = 0;

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "count", count++ } };
	}

	public static void main(String[] args) {
		//ResourceBundle rb = new ResourceBundle("counter.CountResource"); //compile error!
		//System.out.println(rb.getObject("count") + " " + rb.getObject("count"));
	}
}
