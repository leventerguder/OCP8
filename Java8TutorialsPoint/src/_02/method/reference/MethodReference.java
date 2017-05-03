package _02.method.reference;

import java.util.List;
import java.util.ArrayList;

public class MethodReference {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);

	}
}
// Method references help to point to methods by their names
// A method reference is described using :: symbol

// static methods
// instance methods
// constructor using new operator