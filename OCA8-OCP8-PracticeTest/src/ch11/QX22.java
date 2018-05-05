package ch11;

public class QX22 {
	static {
		System.out.println("static");
	}

	private static void drive() {
		System.out.println("fast");
	}

	public static void main(String[] args) {
		drive();
		drive();
	}
}
