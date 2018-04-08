package chapter06._05_sortCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedTest02 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));

		// int compare(T o1, T o2);
		Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();

		words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);
		System.out.println();
	}
}
