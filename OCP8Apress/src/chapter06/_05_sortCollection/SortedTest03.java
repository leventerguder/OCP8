package chapter06._05_sortCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedTest03 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));

		// int compare(T o1, T o2);
		Comparator<String> stringCompareTo = String::compareTo;
		// public int compareTo(String anotherString) {
		
		words.stream().distinct().sorted(stringCompareTo).forEach(System.out::println);

	}
}