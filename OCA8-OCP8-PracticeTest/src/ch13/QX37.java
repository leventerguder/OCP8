package ch13;

import java.util.List;
import java.util.ArrayList;

public class QX37 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Austin");
		list.add("Boston");
		list.add("San Francisco");

		long c = list.stream().filter(a -> a.length() > 10).count();
		System.out.println(c + " " + list.size());
	}
}
