package ch02._01.interface$;

public class EagleTest {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		System.out.println(eagle.getWingSpan());
		//
		eagle.land();
		eagle.eat();
		//
		// static method call
		System.out.println(Fly.calculateSpeed(10, 2));
		// eagle..calculateSpeed(10, 2); //not valid.
	}
}
