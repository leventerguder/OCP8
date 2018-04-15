package mock;

import java.util.Arrays;
import java.util.List;

public class QX73 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("foo;bar;baz", "", "qux;norf");

		lines.stream().flatMap(line -> Arrays.stream(line.split(";"))) // FLAT
				.forEach(str -> System.out.print(str + ":"));

		// foo:bar:baz::qux:norf:
	}
}
