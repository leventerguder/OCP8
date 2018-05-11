package ch14;

import java.util.function.Consumer;
import java.util.ArrayList;

//
public class QX24 {

	public static void main(String[] args) {
		// Consumer<Object> consumer1 = ArrayList::new;
		// Consumer<Object> consumer2 = String::new;
		Consumer<Object> consumer3 = System.out::println;
	}
}
