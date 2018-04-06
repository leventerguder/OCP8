package chapter03.questions;

class Shape2 {
	private boolean isDisplayed;
	protected int canvasID;

	public Shape2() {
		isDisplayed = false;
		canvasID = 0;
	}

	public class Color {
		public void display() {
			System.out.println("isDisplayed: " + isDisplayed);
			System.out.println("canvasID: " + canvasID);
		}
	}
}

class Q4 {
	public static void main(String[] args) {
		Shape2.Color black = new Shape2().new Color();
		black.display();
	}
}