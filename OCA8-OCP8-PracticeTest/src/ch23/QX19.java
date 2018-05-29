package ch23;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class QX19 {

	// Which of the following can fill in the blank to print out the numbers
	// 161, 183, and 201 in any order?

	public static void main(String[] args) {
		Stream<Runner> runners = Stream.of(new Runner(183), new Runner(161), new Runner(201));

		OptionalInt opt = runners.mapToInt(Runner::getNumberMinutes).peek(System.out::println).max();
	}
}

class Runner {
	private int numberMinutes;

	public Runner(int n) {
		numberMinutes = n;
	}

	public int getNumberMinutes() {
		return numberMinutes;
	}
}