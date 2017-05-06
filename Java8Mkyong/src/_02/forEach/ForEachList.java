package _02.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachList {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		items.forEach(System.out::println);
		System.out.println();
		
		Consumer<String> c = (str) -> System.out.println(str);
		items.forEach(c);
		System.out.println();
		
		items.stream().filter(s->s.contains("B")).forEach(System.out::println);
		
	}
}
