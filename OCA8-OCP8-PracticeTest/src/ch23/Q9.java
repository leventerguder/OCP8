package ch23;

import java.util.Optional;

public class Q9 {

	public static void main(String[] args) {
		eatDessert(Optional.empty());
	}

	private static void eatDessert(Optional<String> opt) {
		System.out.println(opt.orElse("No dessert today"));
		System.out.println(opt.orElseGet(() -> "No dessert today"));
	}
}
