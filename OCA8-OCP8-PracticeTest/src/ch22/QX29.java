package ch22;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class QX29 extends ListResourceBundle {
	private int count = 0;

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "count", new QX29() } };
	}

	public int getCount() {
		return count++;
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ch22.QX29");
		QX29 obj = (QX29) rb.getObject("count");
		System.out.println(obj.getCount() + " " + obj.getCount());
	}
}
