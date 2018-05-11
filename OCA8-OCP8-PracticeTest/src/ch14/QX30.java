package ch14;

import java.util.function.DoubleToIntFunction;

public class QX30 {

}

class Bank {
	private int savingsInCents;

	private static class ConvertToCents {
		// static DoubleToIntFunction f = p -> p * 100; //compiler error
	}
}