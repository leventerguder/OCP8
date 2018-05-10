package ch13;

import java.util.Comparator;
//   int compare(T o1, T o2);

public class QX39 {

	public static void main(String[] args) {
		Comparator<Character> comp = (c1, c2) -> 0;
	}
}

// Which of the following declares a Comparator where all objects are treated as
// equal?
// A. Comparator<Character> comp = (c1)-> 0;
// B. Comparator<Character> comp = (c1)-> {0};
// C. Comparator<Character> comp = (c1, c2)-> 0;
// D. Comparator<Character> comp = (c1, c2)-> {0};