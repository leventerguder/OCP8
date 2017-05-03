package _04.default$.method;

interface Vehicle {
	public default void print() {
		System.out.println("Vehicle#print");
	}
}

class Car implements Vehicle {

}

public class DefaultTest {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.print();
	}
}
