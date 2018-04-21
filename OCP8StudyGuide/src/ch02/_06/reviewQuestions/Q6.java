package ch02._06.reviewQuestions;

import java.util.function.*;

public class Q6 {
	int age;

	public static void main(String[] args) {
		Q6 p1 = new Q6();
		p1.age = 1;
		check(p1, p -> p.age < 5); // h1
	}

	private static void check(Q6 panda, Predicate<Q6> pred) { // h2
		String result = pred.test(panda) ? "match" : "not match"; // h3
		System.out.print(result);
	}
}