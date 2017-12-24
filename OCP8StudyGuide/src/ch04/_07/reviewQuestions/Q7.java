package ch04._07.reviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

	private static List<String> sort(List<String> list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}

	private static List<String> sort2(List<String> list) {
		return list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("levent", "jack","donald","murphy" ,"blade");
		
		System.out.println(sort(list));
		System.out.println(sort2(list));
	}

}
