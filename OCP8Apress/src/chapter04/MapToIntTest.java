package chapter04;

import java.util.Arrays;
import java.util.regex.Pattern;

public class MapToIntTest {

	public static void main(String[] args) {
		Object[] words = Pattern.compile(" ").splitAsStream("1 2 3 4 5").toArray();
		Arrays.stream(words).mapToInt(str -> Integer.valueOf((String) str)).sum();
	}
}
