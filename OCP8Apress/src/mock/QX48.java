package mock;

import java.util.function.Function;
import java.util.stream.Stream;

public class QX48 {

	public static void main(String[] args) {
        Stream<Integer> ints = Stream.of(1, 2, 3, 4);
		boolean result = ints.parallel().map(Function.identity()).isParallel();
        System.out.println(result);
	}
}
