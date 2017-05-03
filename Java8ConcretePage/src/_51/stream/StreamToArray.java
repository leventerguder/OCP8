package _51.stream;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("J", "A", "V", "A");
		Object[] array = list.stream().toArray();
		System.out.println(array.length);
	}
}
