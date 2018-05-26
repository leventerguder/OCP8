package ch20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QX38 {

	public static void main(String[] args) throws InterruptedException {
		//
		ExecutorService teller = Executors.newScheduledThreadPool(50);

		Bank bank = new Bank();
		for (int i = 0; i < 25; i++) {
			teller.submit(() -> bank.deposit(5));
			teller.submit(() -> bank.withdrawal(5));
		}

		teller.shutdown();
		teller.awaitTermination(10, TimeUnit.SECONDS);
		System.out.print(bank.cookies);
		//
		// A. 0
	}
}

// Assuming 10 seconds is enough time for all of the tasks to finish, what is
// the output of the following application?

class Bank {
	static int cookies = 0;

	public synchronized void deposit(int amount) {
		cookies += amount;
	}

	// The instance method deposit() synchronizes on the bank object
	// static method withdrawal() synchronizes on the static Bank.class object.
	// Even though method calls of the same type are protected,
	// calls across the two different methods are not.

	// C. The result is unknown until runtime.
	public static synchronized void withdrawal(int amount) {
		cookies -= amount;
	}
}