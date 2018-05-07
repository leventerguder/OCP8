package ch13;

public class QX17 {

}

class Truck implements Comparable<Truck> {
	private int id;

	public Truck(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Truck t) {
		return id - t.id;
	}

}
