package ch11;

public class QX33 {

}

class CarsQX33 {
	private static void drive() {
		// None of above.The code does not compile
		// static { System.out.println("static"); }

		System.out.println("fast");
	}

	public static void main(String[] args) {
		drive();
		drive();
	}
}