package _15.stringJoining;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CollectorsJoining {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

		String result = list.stream().collect(Collectors.joining(" | "));
		System.out.println(result);
	}
}
