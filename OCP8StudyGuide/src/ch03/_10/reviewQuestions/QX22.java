package ch03._10.reviewQuestions;

public class QX22 {

	public static <T> T identity(T t) {
		return t;
	}
}

// When using generic types in a static method, the generic specification goes
// before the return type.