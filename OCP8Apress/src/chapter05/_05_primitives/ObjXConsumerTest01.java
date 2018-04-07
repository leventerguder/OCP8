package chapter05._05_primitives;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ObjXConsumerTest01 {
	public static void main(String[] args) {
		
//		ObjIntConsumer<T>    # void accept(T, int)
//		ObjLongConsumer<T>   # void accept(T , long)
//		ObjDoubleConsumer<T> # void accept(T , double)
		
		ObjIntConsumer<String> charAt = (str, i) -> {
			char c = str.charAt(i); // #1
			System.out.println(c);
		};
		charAt.accept("java", 2); // #2
	}
}
