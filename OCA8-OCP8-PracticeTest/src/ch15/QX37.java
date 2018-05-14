package ch15;

import java.util.stream.Stream;

public class QX37 {

	public static void main(String[] args) {

		Stream<Runner> runners = Stream.of(new Runner(250), new Runner(600), new Runner(201));
		long count = runners.filter(Runner::isFourMinuteMile).count();
		System.out.println(count);
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

	public boolean isFourMinuteMile() {
		return numberMinutes < 4 * 60;
	}
}