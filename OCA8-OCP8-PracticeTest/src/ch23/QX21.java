package ch23;

import java.util.function.*;

abstract class Phantom {
	public void bustLater(DoubleConsumer buster, double value) {
		buster.accept(value);
	}
}

class Ghost extends Phantom {
	public void bustNow(Consumer<Double> buster, double value) {
		buster.accept(value);
	}

	void call() {
		double value = 10;
		bustNow(System.out::println, value);
		bustLater(System.out::println, value);

		bustNow(g -> {
			System.out.println();
		}, value);
		bustLater(g -> {
			System.out.println();
		}, value);

		bustNow(v -> System.out.print(v), value);
		bustLater(v -> System.out.print(v), value);
		
	}
}

public class QX21 {

}
