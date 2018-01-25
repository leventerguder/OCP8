package mock;

public class Q5 {

}

class Point {
	private int x = 0, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private Point() {
		this(0, 0);
	}

	// Cannot refer to an instance field x while explicitly invoking a constructor
	// public Point() {
	// this(x, 0);
	// }
}