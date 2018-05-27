package ch22;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

//class CountResource extends ListResourceBundle {
//
//}

public class QX12 extends ListResourceBundle {
	private int count = 0;

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "count", count++ } };
	}

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("ch22.QX12");
		System.out.println(rb.getObject("count") + " " + rb.getObject("count"));
		// The value is not incremented each time because the getContents()
		// method is only called once.
	}
}
