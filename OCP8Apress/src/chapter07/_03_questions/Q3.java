package chapter07._03_questions;

public class Q3 {
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			// throw new Exception(oob); //compiler error
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getCause());
		}
	}

}
