package ch15;

import java.util.Optional;

public class QX27 {

}

class Dessert {
	
	private static void eatDessert(Optional<String> opt) {
		System.out.println(opt.get());
	}
}