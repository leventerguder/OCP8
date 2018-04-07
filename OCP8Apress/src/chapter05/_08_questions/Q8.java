package chapter05._08_questions;

import java.util.function.ObjIntConsumer;

public class Q8 {

	public static void main(String[] args) {
		ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i);
		// System.out.println(charAt.accept("java", 2));
		// The method println(boolean) in the type PrintStream is not applicable
		// for the arguments (void)
		
		charAt.accept("java", 2);
	}
}
