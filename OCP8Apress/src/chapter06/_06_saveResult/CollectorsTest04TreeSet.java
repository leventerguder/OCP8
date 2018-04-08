package chapter06._06_saveResult;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectorsTest04TreeSet {

	public static void main(String[] args) {
		String[] roseQuote = "a rose is a rose is a rose".split(" ");
		//
		Supplier<TreeSet<String>> supplier = TreeSet::new;
		//
		Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toCollection(supplier));
		words.forEach(System.out::println);

		Set<String> words2 = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
		Set<String> words3 = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet<String>::new));

	}
}
