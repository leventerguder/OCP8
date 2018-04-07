package chapter04.stream;

import java.util.Random;

public class Test04RandomIntExample {

	public static void main(String[] args) {
		new Random().ints().limit(10).forEach(System.out::println);
	}
}
