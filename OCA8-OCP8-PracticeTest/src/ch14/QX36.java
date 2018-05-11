package ch14;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class QX36 {

	public static void main(String[] args) {
		//
		int MAX_LENGTH = 2;
		DogSearch search = new DogSearch();
		List<String> names = new ArrayList<>();
		names.add("Lassie");
		names.add("Benji");
		names.add("Brian");
		MAX_LENGTH += names.size();

		//
		// C. The code does not compile because of lambda expression.
		// Local variable MAX_LENGTH defined in an enclosing scope must be final
		// or effectively final
		//search.reduceList(names, d -> d.length() > MAX_LENGTH);
		System.out.print(names.size());
	}
}

class DogSearch {
	void reduceList(List<String> names, Predicate<String> tester) {
		names.removeIf(tester);
	}
}