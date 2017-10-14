package chapter04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(string -> System.out.println(string));
		//
		System.out.println();

		strings.forEach(System.out::println);

		//
		Consumer<String> c = System.out::println;
		//

		Consumer<Integer> c2 = ForEachExample::method;
		
		Consumer<Integer> c3 = new ForEachExample()::method2;
		
		//Consumer<ForEachExample> c4 =  ForEachExample::method3;
	}

	public static void method(int a) {

	}
	
	public void method2(int a) {

	}
	
	public void method3(ForEachExample f) {}
}
