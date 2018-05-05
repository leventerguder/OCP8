package ch11;

import java.util.List;
import java.util.ArrayList;

public class QX14 {

}
// Which of these classes is/are immutable?
// B Plant

final class Flower {
	private final String name;
	private final List<Integer> counts;

	public Flower(String name, List<Integer> counts) {
		this.name = name;
		this.counts = counts;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getCounts() {
		return counts;
	}
}

final class Plant {
	private final String name;
	private final List<Integer> counts;

	public Plant(String name, List<Integer> counts) {
		this.name = name;
		this.counts = new ArrayList<>(counts);
	}

	public String getName() {
		return name;
	}

	public List<Integer> getCounts() {
		return new ArrayList<>(counts);
	}
}