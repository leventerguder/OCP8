package ch03;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfTest {

	public static void main(String[] args) {
		// boolean removeIf(Predicate<? super E> filter)
		//
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		//
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // [Magician]
	}
}
