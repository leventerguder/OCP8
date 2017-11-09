package ch03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTest {

	public static void main(String[] args) {
		// void accept(T t);
		Consumer<List<Integer>> ref = Collections::sort;
		Consumer<List<Integer>> ref2 = l -> Collections.sort(l);
		// public static <T extends Comparable<? super T>> void sort(List<T>
		// list) {
		//
		// public boolean startsWith(String prefix)
		Predicate<String> ref3 = new String()::startsWith;
		Predicate<String> ref4 = s -> s.startsWith(s);

		// Predicate<String> ref5 = String::startsWith;
		Predicate<String> ref5 = String::isEmpty;
		// Java uses the parameter supplied at runtime as the instance on which
		// the method is called.
		//
		// T get();
		Supplier<ArrayList<Integer>> ref6 = ArrayList<Integer>::new;
		Supplier<ArrayList<Integer>> ref7 = () -> new ArrayList<Integer>();
	}
}
