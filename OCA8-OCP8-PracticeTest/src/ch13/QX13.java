package ch13;

import java.util.List;
import java.util.ArrayList;

public class QX13 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Monday");
		// list.add(String::new); // The code does not compile.
		list.add("Tuesday");
		list.remove(0);
		System.out.println(list.get(0));
	}
}
