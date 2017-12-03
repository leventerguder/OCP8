package ch04._01.variableInLambdas;

interface Gorilla {
	String move();
}

public class GorillaFamily {

	String walk = "walk";

	void everyonePlay(boolean baby) {
		String approach = "amble";
		//
		// approach ="compiler errror";

		Gorilla g1 = () -> walk;
		Gorilla g2 = () -> baby ? "hitch a ride" : "run";
		Gorilla g3 = () -> approach;
	}
}
