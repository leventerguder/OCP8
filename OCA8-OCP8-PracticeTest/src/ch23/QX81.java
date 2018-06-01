package ch23;

public class QX81 {

}

// Which of the following are valid functional interfaces? (Choose two.)

// @FunctionalInterface //compile error
interface CanClimb {
	default void climb() {
	}

	static void climb(int x) {
	}
}

//interface CanDance {
//	int dance() { return 5;} // compile error
//}

@FunctionalInterface
interface CanFly {
	abstract void fly();
}

@FunctionalInterface
interface CanRun {
	void run();

	static double runFaster() {
		return 2.0;
	}
}

// @FunctionalInterface //compile error
interface CanSwim {
	abstract Long swim();

	boolean test();
}