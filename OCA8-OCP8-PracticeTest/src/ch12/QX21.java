package ch12;

interface Edible {
	void eat();
}

public class QX21 {

	public static void main(String[] args) {

		Edible apple = new Edible() {

			@Override
			public void eat() {
				System.out.println("Yummy!");
			}
		};
	}

}
