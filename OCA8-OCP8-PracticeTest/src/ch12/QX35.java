package ch12;

public class QX35 {

	public static void main(String[] moreNumbers) {
		final Calculator ti = new Calculator();
		ti.calculate((k, p) -> p + k + 1, 2, 5); // j1
	}
}

interface AddNumbers {
	int add(int x, int y);

	static int subtract(int x, int y) {
		return x - y;
	}

	default int multiply(int x, int y) {
		return x * y;
	}
}

class Calculator {
	protected void calculate(AddNumbers add, int a, int b) {
		System.out.print(add.add(a, b));
	}
}