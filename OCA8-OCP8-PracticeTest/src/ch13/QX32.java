package ch13;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.TreeMap;

public class QX32 {

	// Which of the following cannot fill in the blank to make the code compile?
	private void output(ArrayDeque<?> x) {
		x.forEach(System.out::println);
	}
	
	private void output(Collection<?> x) {
		x.forEach(System.out::println);
	}
	
	// compiler error
	
	//	private void output(TreeMap<?> x) {
	//		x.forEach(System.out::println);
	//	}
}
