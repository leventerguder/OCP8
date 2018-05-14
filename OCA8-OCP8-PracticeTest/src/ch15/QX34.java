package ch15;

import java.util.stream.Stream;

public class QX34 {

	public static void main(String[] args) {
		//
		Stream<Boolean> hide = Stream.of(true, false, true);
		boolean found = hide.filter(b -> b).anyMatch(b -> b);
		System.out.println(found);
	}
}
