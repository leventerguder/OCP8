package ch02._06.reviewQuestions;

interface CanClimb {
	public abstract void climb();
}

interface CanClimbTrees extends CanClimb {
}

abstract class Chipmunk implements CanClimbTrees {
	public abstract void chew();
}

public class Q2 extends Chipmunk {
	
	public void chew() {
		System.out.println("Eastern Chipmunk is Chewing");
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}
}