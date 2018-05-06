package ch12;

public class QX22 {

	static class Tree {
	}

	public static void main(String[] leaves) {
		int water = 10 + 5;
		final class Oak extends Tree { // p1
			public int getWater() {
				return water; // p2
			}
		}
		System.out.print(new Oak().getWater());
	}
}
