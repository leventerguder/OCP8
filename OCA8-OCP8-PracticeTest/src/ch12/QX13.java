package ch12;

enum Direction {
	NORTH, SOUTH, EAST, WEST;
};

public class QX13 {
	public static void main(String[] compass) {
		System.out.print(Direction.valueOf(compass[0]));
	}
}
