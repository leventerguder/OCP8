package ch13;

import java.util.List;
import java.util.Arrays;

public class QX35 {

	public static void main(String[] args) {
		Blankie b1 = new Blankie();
		Blankie b2 = new Blankie();
		b1.color = "pink";
		List<Blankie> list = Arrays.asList(b1, b2);
		
		//list.stream().filter(Blankie::getColor).forEach(System.out::println); //compile error
	}
}

class Blankie {
	String color;

	String getColor() {
		return color;
	}
}