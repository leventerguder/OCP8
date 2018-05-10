package ch14;

import java.util.function.IntUnaryOperator;

public class Q8 {

	public static void main(String[] args) {
		final TicketTaker bob = new TicketTaker();
		final int oldCount = 50;
//		final int newCount = bob.takeTicket(oldCount, t -> {
//			if (t > AT_CAPACITY) {
//				throw new RuntimeException("Sorry, max has been reached");
//			}
//			return t + 1;
//		});
//		System.out.print(newCount);
	}
}

class TicketTaker {

	private static int AT_CAPACITY = 100;

	// The type IntUnaryOperator is not generic; it cannot be parameterized with arguments <Integer>
	//	public int takeTicket(int currentCount, IntUnaryOperator<Integer> counter) {
	//		return counter.applyAsInt(currentCount);
	//	}
}