package chapter06._08_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		//
		List<String> strings = Arrays.asList("eeny ", "meeny ", "miny ", "mo ");
		Collections.sort(strings, (str1, str2) -> str2.compareTo(str1));
		//
		strings.forEach(string -> System.out.println(string));
	}
}
