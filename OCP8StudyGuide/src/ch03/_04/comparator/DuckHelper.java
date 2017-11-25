package ch03._04.comparator;

public class DuckHelper {
	//
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}

	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
}

class Duck {
	//
	private String name;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}