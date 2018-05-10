package ch13;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class QX27 {

	public static void main(String[] args) {
		//
		List<String> list = new ArrayList<>();
		list.add("Atlanta");
		list.add("Chicago");
		list.add("New York");
		// // Fill in the blank so this code outputs three lines:

		list.stream().filter(((Predicate<String>) String::isEmpty).negate()).forEach(System.out::println);
	}
}
//
//A. String::isEmpty
//B. ! String::isEmpty
//C. String::! isEmpty
//D. None of the above (+)