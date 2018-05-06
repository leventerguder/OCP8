package ch12;

public class QX28 {

}

class Penguin {
	private int volume = 1;

	private class Chick {
		// private static int volume = 3; // compile error

		void chick() {
			System.out.print("Honk(" + Penguin.this.volume + ")!");
		}
	}

	public static void main(String... eggs) {
		Penguin pen = new Penguin();
		final Penguin.Chick littleOne = pen.new Chick();
		littleOne.chick();
	}
}