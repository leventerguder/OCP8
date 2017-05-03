package _51.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C");
		list.stream().peek(s -> System.out.println(s + s)).collect(Collectors.toList());
		
	}
}
