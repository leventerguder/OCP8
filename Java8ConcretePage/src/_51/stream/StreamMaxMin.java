package _51.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20,10,80,70,5,3);
		Integer max=numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(max);
	}
}
