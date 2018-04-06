package chapter03.questions;

class Shape {
	public Shape() {
		System.out.println("Shape constructor");
	}

	public class Color {
		public Color() {
			System.out.println("Color constructor");
		}
	}
}

class Q3 {
	public static void main(String[] args) {
		// Shape.Color black = new Shape().Color(); // #1
		// A. Compiler error: the method Color() is undefined for the type Shape

		Shape.Color black = new Shape().new Color();
	}
}