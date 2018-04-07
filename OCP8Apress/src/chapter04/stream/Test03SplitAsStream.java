package chapter04.stream;

import java.util.regex.Pattern;

public class Test03SplitAsStream {

	public static void main(String[] args) {
		Pattern.compile(" ").splitAsStream("java 8 stream example").forEach(System.out::println);
	}
}
