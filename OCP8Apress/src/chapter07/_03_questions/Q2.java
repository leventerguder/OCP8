package chapter07._03_questions;

class Q2 {
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			RuntimeException re = new RuntimeException(oob);
			re.initCause(oob);
			throw re;

			// The method initCause() cannot be called on an exception object
			// that already has an exception object chained during the
			// constructor call
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getClass());
		}
	}
}