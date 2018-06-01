package ch23;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class QX70 {

	// D. The code compiles and runs without output.
	
	public static void main(String[] args) {
		List list = Arrays.asList("Sunny");
		method(list);
	}

	private static void method(Collection<?> x) {
		x.forEach(a -> {
		});
	}

}