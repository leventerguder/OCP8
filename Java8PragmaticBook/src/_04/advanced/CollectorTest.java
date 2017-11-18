package _04.advanced;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CollectorTest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 1, 1, -10, 20);

		//
		Set<Integer> numberSet = numbers.stream().map(x -> x + 1).collect(Collectors.toSet());
		System.out.println(numberSet.getClass()); // java.util.HashSet
		System.out.println(numberSet);
		//

		Set<Integer> numberTreeSet = numbers.stream().map(x -> x + 1).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(numberTreeSet);
	}
}
