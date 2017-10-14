package chapter04;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(MethodReference::printUpperCaseString);
	}

	public static void printUpperCaseString(String string) {
		System.out.println(string.toUpperCase());
	}
}
