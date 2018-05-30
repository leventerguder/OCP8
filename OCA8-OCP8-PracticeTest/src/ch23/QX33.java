package ch23;

import java.util.stream.*;

public class QX33 {
	public static void main(String[] args) {
		Blankie b1 = new Blankie();
		Blankie b2 = new Blankie();
		b1.color = "pink";
		Stream.of(b1, b2).filter(Blankie::isPink).forEach(System.out::println);
	}
}
// How many lines does the following output?
// B. One

class Blankie {
	String color;

	boolean isPink() {
		return "pink".equals(color);
	}
}