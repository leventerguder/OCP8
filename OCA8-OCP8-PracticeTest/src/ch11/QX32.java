package ch11;

import java.util.List;
import java.util.ArrayList;

public class QX32 {

}

// Which of these classes is/are immutable?
// Both classes

class FlowerQX32 {

	private final String name;
	private final List<Integer> counts;

	public FlowerQX32(String name, List<Integer> counts) {
		this.name = name;
		this.counts = new ArrayList<>(counts);
	}

	public final String getName() {
		return name;
	}

	public final List<Integer> getCounts() {
		return new ArrayList<>(counts);
	}
}

class PlantQX32 {

	private final String name;
	private final List<Integer> counts;

	public PlantQX32(String name, List<Integer> counts) {
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