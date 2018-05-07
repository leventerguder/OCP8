package ch13;

import java.util.Iterator;
import java.util.LinkedList;


public class Q8 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Grapes of Wrath");
		list.add("1984");
		list.forEach(System.out::println);
		Iterator it = list.iterator();
		//		while (it.hasMore())
		//			System.out.println(it.next());
		// The hasMore() method should be changed to hasNext().
	}

}
