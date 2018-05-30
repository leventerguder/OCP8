package ch23;

import java.util.function.*;
import java.util.stream.*;

public class QX58 {

	public static void main(String[] args) {
		Stream<Boolean> hide = Stream.of(true, false, true);
		Predicate<Boolean> pred = b -> b;
		//boolean found = hide.filter(pred).anyMatch (pred);
		boolean found = hide.filter(pred).allMatch (pred);
		System.out.println(found);
		
		// Which can fill in the blank so this code outputs true?
		// C. Both anyMatch() and allMatch()
	}
}

