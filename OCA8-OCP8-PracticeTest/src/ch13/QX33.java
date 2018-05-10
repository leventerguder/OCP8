package ch13;

import java.util.List;
import java.util.LinkedList;

public class QX33 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Archie");
		list.add("X-Men");

		// compiler error
		// list.stream().forEach(System.out.println);
		// list.stream().forEach(System.out.println);
	}
}
