package chapter06._05_sortCollection;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedTest05 {

	public static void main(String[] args) {

		// public int compareTo(Double anotherDouble) {
		Comparator<Double> comp1 = Double::compareTo;

		// public static int compare(double d1, double d2)
		Comparator<Double> comp2 = Double::compare;

		Stream<Double> s1 = Stream.of(2.5, 6.7, 3.4, 5.8, 10.9, 1.2, 3.2);
		s1.sorted(comp1).forEach(str -> System.out.print(str + " "));

		System.out.println();
		//
		Stream<Double> s2 = Stream.of(2.5, 6.7, 3.4, 5.8, 10.9, 1.2, 3.2);
		s2.sorted(comp2).forEach(str -> System.out.print(str + " "));

	}
}
