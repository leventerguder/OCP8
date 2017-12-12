package ch04._03.optional;

import java.util.Optional;

public class OptionalTest02 {

	public static void main(String[] args) {
		Optional<Integer> opt = Optional.of(100);
		boolean isPresent = opt.isPresent();
		System.out.println(isPresent);
		
		System.out.println(opt.get());
	}
}
