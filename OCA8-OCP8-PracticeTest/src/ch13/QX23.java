package ch13;

import java.util.LinkedList;
import java.util.Iterator;

public class QX23 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Grapes of Wrath");
		list.add("1984");
		list.stream().forEach(System.out::println);

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
