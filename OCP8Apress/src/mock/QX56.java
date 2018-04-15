package mock;

import java.util.concurrent.atomic.AtomicInteger;

public class QX56 {
	private static AtomicInteger counter = new AtomicInteger(0);

	static class Decrementer extends Thread {
		public void run() {
			counter.decrementAndGet(); // #1
		}
	}

	static class Incrementer extends Thread {
		public void run() {
			counter.incrementAndGet(); // #2
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Incrementer().start();
			new Decrementer().start();
		}
		System.out.println(counter);
		// b) This program will print any value between −5 to 5

		// You have employed AtomicInteger, which provides a set of atomic
		// methods such as incrementAndGet() and decrementAndGet(). Hence, you will
		// always get 0 as the final value of counter. However, depending on thread
		// scheduling, the intermediate counter values may be anywhere between
		// −5 to +5, Hence the output of the program can range between −5 and
		// +5.
	}
}
