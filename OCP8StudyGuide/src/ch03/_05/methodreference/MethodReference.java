package ch03._05.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		// static methods
		Consumer<List<Integer>> mf0 = Collections::sort;
		Consumer<List<Integer>> lambda0 = list -> Collections.sort(list);

		// instance method
		String str = "test";
		Predicate<String> mf1 = str::startsWith;
		Predicate<String> lambda1 = (String s) -> s.startsWith(s);

		// Java knows that isEmpty is an instance method that does not take any
		// parameters. Java uses the parameter supplied at runtime as the
		// instance on which the method is called.

		// public boolean startsWith(String prefix)

		// public boolean isEmpty() 
		Predicate<String> mf2 = String::isEmpty;
		Predicate<String> lambda2 = s -> s.isEmpty();

		//
		Supplier<ArrayList> mf3 = ArrayList::new;
		Supplier<ArrayList> lambda3 = () -> new ArrayList();

	}

}

// Consumer#void accept(T t)