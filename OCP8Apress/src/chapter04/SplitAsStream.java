package chapter04;

import java.util.regex.Pattern;

public class SplitAsStream {

	public static void main(String[] args) {
		Pattern.compile(" ").splitAsStream("java 8 stream example").forEach(System.out::println);
	}
}
