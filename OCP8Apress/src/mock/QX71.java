package mock;

import java.util.Arrays;
import java.util.List;

public class QX71 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(15, 5, 10, 20, 25, 0);

		Integer max = integers.stream().max((i, j) -> i - j).get();
	}
}
