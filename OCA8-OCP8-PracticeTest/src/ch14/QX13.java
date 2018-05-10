package ch14;

import java.util.function.Supplier;

public class QX13 {

	public static void main(String[] args) {
		Android data = new Android();
		// data.wakeUp(() -> System.out.print("Program started!"));
		// - The method wakeUp(Supplier) in the type Android is not applicable
		// for the arguments (() -> {})
	}
}

class Android {

	public void wakeUp(Supplier supplier) {
		supplier.get();
	}
}