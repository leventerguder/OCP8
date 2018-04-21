package ch02._06.reviewQuestions;

public class QX10 {

}

interface CanWalk {
	default void walk() {
		System.out.println("Walking");
	}
}

interface CanRun {
	public default void walk() {
		System.out.println("Walking");
	}

	public abstract void run();
}

interface CanSpring extends CanWalk, CanRun {
	void sprint();

	@Override
	default void walk() {
		CanRun.super.walk();
	}
}