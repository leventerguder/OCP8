package ch03._10.reviewQuestions;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class QX21 {

	public static void main(String[] args) {
		//
		List<String> list = Arrays.asList("1", "2", "3");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
