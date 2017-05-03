package _05.static$.method;

interface Vehicle {
	public static void drive() {
		System.out.println("Vehicle#drive");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Vehicle.drive();
	}
}
