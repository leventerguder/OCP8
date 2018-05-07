package ch13;

import java.util.List;
import java.util.LinkedList;

public class QX14 {

	public static void main(String[] args) {
		//
		List<String> list = new LinkedList<>();
		list.add("Archie");
		list.add("X-Men");
		//
		list.stream().forEach(s -> System.out.println(s));
		list.stream().forEach(s -> System.out.println(s));

	}
}
