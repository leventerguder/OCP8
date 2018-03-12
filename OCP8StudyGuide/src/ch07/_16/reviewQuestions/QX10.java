package ch07._16.reviewQuestions;

import java.util.Arrays;

public class QX10 {

	public static void main(String[] args) {
		//compiler error
		// System.out.println(Arrays.asList("duck", "chicken", "flamingo",
		// "pelican").parallelStream().parallel()
		// .reduce(0, (c1, c2) -> c1.length() + c2.length(), (s1, s2) -> s1 +
		// s2));
	}
}
