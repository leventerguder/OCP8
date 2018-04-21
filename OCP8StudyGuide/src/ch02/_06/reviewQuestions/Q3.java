package ch02._06.reviewQuestions;

public class Q3 {

}

@FunctionalInterface
interface Climb {
	public int climb();
}

abstract class Swim {
	abstract Object swim(double speed, int duration);
}

interface ArcticMountainClimb extends MountainClimb {
	//public default int getSpeed();
}

@FunctionalInterface
interface MountainClimb extends Climb {
}
