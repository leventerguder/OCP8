package ch04._03.optional;

import java.util.Optional;

public class OptionalTest04 {

	public static void main(String[] args) {
		Optional<Integer> opt = Optional.of(100);
		System.out.println(opt.orElse(200));
		//

		Optional<Integer> empty = Optional.ofNullable(null);
		System.out.println(empty.orElse(200));

		System.out.println(empty.orElseGet(() -> (int) Math.random()));

		//
		empty.orElseThrow(() -> new IllegalStateException());
	}
}
