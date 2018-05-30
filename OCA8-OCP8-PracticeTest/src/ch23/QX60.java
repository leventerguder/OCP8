package ch23;

import java.util.Set;
import java.util.TreeSet;

public class QX60 {

	public static void main(String[] args) {

		Set<Integer> dice = new TreeSet<>();
		dice.add(6);
		dice.add(6);
		dice.add(4);

		// dice.stream().filter(n -> n != 4).forEach(System.out::println).count();
		//D. The code does not compile.
	}
}
