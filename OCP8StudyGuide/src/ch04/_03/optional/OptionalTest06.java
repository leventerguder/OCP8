package ch04._03.optional;

import java.util.Optional;

public class OptionalTest06 {

	public static void main(String[] args) {
		Optional<Double> opt = Optional.ofNullable(null);
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(Math::random));
		System.out.println(opt.orElseThrow(ArithmeticException::new));
	}
}
