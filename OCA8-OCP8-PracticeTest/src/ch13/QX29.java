package ch13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class QX29 {

	private static <T extends Collection<U>, U> U add(T list, U element) {
		list.add(element);
		return element;
	}

	public static void main(String[] args) {
		//
		List<String> values = new ArrayList<>();
		add(values, "duck");
		add(values, "duck");
		add(values, "goose");
		System.out.println(values);
	}

}
