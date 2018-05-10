package ch13;

import java.util.List;
import java.util.ArrayList;

public class QX30 {

	public static void main(String[] args) {
		//
		List<String> list = new ArrayList<>();
		list.add("Austin");
		list.add("Boston");
		list.add("San Francisco");

		list.removeIf(a -> a.length() > 10);
		System.out.println(list.size());
	}
}
