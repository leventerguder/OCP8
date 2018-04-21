package ch02._06.reviewQuestions;

public class QX20 {

}

interface CanFly {
	void fly();
}

interface HasWings {
	public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings {
}