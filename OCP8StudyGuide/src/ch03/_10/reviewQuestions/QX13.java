package ch03._10.reviewQuestions;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Date;

//
public class QX13 {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}

	public static void main(String[] args) {
		QX13 card = new QX13();
		ArrayList<? super Date> list1 = new ArrayList<Date>();
		Vector<? extends Number> list2 = new Vector<Integer>();
	}
}
