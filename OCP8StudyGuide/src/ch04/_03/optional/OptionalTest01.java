package ch04._03.optional;

import java.util.Optional;

public class OptionalTest01 {

	public static void main(String[] args) {
		//
		System.out.println(average(90, 100));
		System.out.println(average());
	}

	public static Optional<Double> average(int... scores) {

		if (scores.length == 0) {
			return Optional.empty();
		}

		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);

	}

}
