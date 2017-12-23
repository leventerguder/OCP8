package ch04._06.advanced;

import java.util.Optional;
import java.util.OptionalInt;

public class Test02ChainingOptional {

	public static void main(String[] args) {
		Optional<Integer> opt = Optional.of(123);
		threeDigit(opt);
		//
		threeDigitBetter(opt);
	}

	private static void threeDigit(Optional<Integer> optional) {
		if (optional.isPresent()) {
			Integer num = optional.get();
			String string = "" + num;
			if (string.length() == 3) {
				System.out.println(string);
			}
		}
	}

	private static void threeDigitBetter(Optional<Integer> optional) {
		optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
	}

	private static void threeDigitBetter2(Optional<Integer> optional) {
		
	}
}
