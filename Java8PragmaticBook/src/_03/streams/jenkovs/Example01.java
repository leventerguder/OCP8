package _03.streams.jenkovs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example01 {

	// http://tutorials.jenkov.com/java-collections/streams.html
	static void main(String[] args) {
		// obtaining a stream from a collection;

		List<String> items = Arrays.asList("one", "two", "three");

		//

		Stream<String> stream = items.stream();
		// like
		Iterator<String> iterator = items.iterator();

		// Stream processing phases
		// once you have obtained a Stream instance from a Collection instance ,
		// you use
		// that stream to process the elements in the collection

		// two phases
		// 1)configuration
		// 2)processing

		//
		// Stream.filter()
		// filter method takes a Predicate as a parameter

		Predicate<String> predicate = (String str) -> str.startsWith("o");
		Stream<String> filtered = stream.filter(predicate);

		List<String> filteredList = filtered.collect(Collectors.toList());
		System.out.println(filteredList);

		/*
		 * It takes a single parameter and returns a boolean. If you look at the
		 * lambda expression above, you can see that it takes a single parameter
		 * item and returns a boolean - the result of the item.startsWith("o")
		 * method call.
		 * 
		 * When you call the filter() method on a Stream, the filter passed as
		 * parameter to the filter() method is stored internally. No filtering
		 * takes place yet.
		 * 
		 * The parameter passed to the filter() function determines what items
		 * in the stream should be processed, and which that should be excluded
		 * from the processing. If the Predicate.test() method of the parameter
		 * passed to filter() returns true for an item, that means it should be
		 * processed. If false is returned, the item is not processed.
		 * 
		 * 
		 * 
		 */

		// ## stream.map()
		// each item in the collection you create a new object based on that
		// item.

		Function<String, String> f = (String str) -> str.toUpperCase();

		Stream<String> mappedStrem = items.stream().map(f);

		// Stream.collect();
		// filterin and mapping will take place and the object resulting from
		// those actions will be collected

		List<String> mappedList = mappedStrem.collect(Collectors.toList());
		System.out.println(mappedList);

		//
		// Stream.min()
		// Stream.max()
		Comparator<String> comparator = (String str, String str2) -> Integer.compare(str.length(), str.length());
		String shortest = items.stream().min(comparator).get();
		System.out.println(shortest);

		String longest = items.stream().max(Comparator.comparing(item -> item.length())).get();
		System.out.println(longest);

		//
		// Stream.count();
		Predicate<String> p2 = (String str) -> str.startsWith("t");
		long count = items.stream().filter(p2).count();
		System.out.println(count);

		// Stream.reduce();
		// reduce method can reduce elements of a stream to single value

		BinaryOperator<String> bo = (String str, String str2) -> str + "!" + str2;

		String reduced = items.stream().reduce(bo).get();

		System.out.println(reduced);
		// the reduce() method takes a BinaryOperator as parameter
		// BinaryOperator.apply() method is the method implemented by the lambda
		// expression
		// reduce method taking BinaryOperator as parameter returns an Optional
		//

		String reduced2 = items.stream().filter(str -> str.startsWith("t")).reduce(bo).get();
	}
}
