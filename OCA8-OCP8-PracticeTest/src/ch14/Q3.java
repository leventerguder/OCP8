package ch14;

import java.util.function.Predicate;

public class Q3 {
	public final static void main(String... sand) {
		new Lifeguard().saveLife(s -> s.distance < 4, new Tourist(2)); // y2
	}
}

class Tourist {
	public Tourist(double distance) {
		this.distance = distance;
	}

	public double distance;
}

class Lifeguard {

	
	void saveLife(Predicate<Tourist> canSave, Tourist tourist) {
		System.out.print(canSave.test(tourist) ? "Saved" : "Too far"); // y1
	}

}