package chapter05._05_primitives;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerTest01 {
	public static void main(String[] args) {
		ObjIntConsumer<String> charAt = (str, i) -> {
			char c = str.charAt(i); // #1
			System.out.println(c);
		};
		charAt.accept("java", 2); // #2
	}
}
