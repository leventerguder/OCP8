package ch02._06.reviewQuestions;

public class QX14 {

}

interface CanHopX14 {
}

class Frog implements CanHopX14 {
	public static void main(String[] args) {
		Frog frog1 = new TurtleFrog();
		TurtleFrog frog2 = new TurtleFrog();
		CanHopX14 frog3 = new TurtleFrog();
		Object frog4 = new TurtleFrog();
	}
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}