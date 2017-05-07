package _14.generateRandomInteger;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomNumberInRange(5, 10));
		}
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}

// java.util.Random.nextInt
// Math.random
// java.util.Random.ints(java8)

// This Random().nextInt(int bound) generates a random integer from 0
// (inclusive) to bound (exclusive).