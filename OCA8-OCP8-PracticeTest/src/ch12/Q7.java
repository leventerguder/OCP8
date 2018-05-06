package ch12;

public class Q7 {

	public static void main(String[] bots) {
		Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
		simulation.printReality();
	}

}

class Matrix {
	private int level = 1;

	class Deep {
		private int level = 2;

		class Deeper {
			private int level = 5;

			public void printReality() {
				System.out.print(level);
				System.out.print(" " + Matrix.Deep.this.level);
				System.out.print(" " + Deep.this.level);
			}
		}
	}
}
