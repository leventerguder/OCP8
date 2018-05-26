package ch20;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Q2 {

	public static void main(String[] args) {
		new TicketTaker().performJob();
	}
}

class TicketTaker {

	long ticketsSold;
	final AtomicInteger ticketsTaken;

	public TicketTaker() {
		ticketsSold = 0;
		ticketsTaken = new AtomicInteger(0);
	}

	public void performJob() {

		IntStream.iterate(1, p -> p + 1).parallel().limit(10).forEach(i -> ticketsTaken.getAndIncrement());
		IntStream.iterate(1, q -> q + 1).limit(5).parallel().forEach(i -> ++ticketsSold);
		// pre increment operator (++), which is not thread safe
		// It is possible two threads could update and set the same value at the
		// same time, a form of race condition, resulting in a value less than
		// 5.
		System.out.print(ticketsTaken + " " + ticketsSold);
	}
}

// I. The class compiles and runs without throwing an exception.
// II. The first number printed is consistently 10.
