package chapter04;

import java.util.Random;

public class RandomIntExample {

	public static void main(String[] args) {
		new Random().ints().limit(10).forEach(System.out::println);
	}
}
