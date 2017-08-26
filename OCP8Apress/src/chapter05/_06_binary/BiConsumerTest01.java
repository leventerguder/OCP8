package chapter05._06_binary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiConsumerTest01 {

	public static void main(String[] args) {
		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		// boolean add(E e);

		List<Integer> aList = new ArrayList<Integer>();
		listAddElement.accept(aList, 10);
		//
		BiPredicate<List<Integer>, Integer> listAddElementP = List::add;
	}
}
