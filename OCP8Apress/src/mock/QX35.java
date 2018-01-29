package mock;

import java.util.Arrays;
import java.util.List;

public class QX35 {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
		ints.replaceAll(i -> i * i);
		System.out.println(ints);
	}
}
