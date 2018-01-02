package ch06._04.reviewQuestions;

public class QX10 {

	private int addPlusOne(int a, int b) {
		// boolean assert = false; //compiler error
		assert a++ > 0; // bad !
		assert b > 0; // god
		return a + b;
	}
}
