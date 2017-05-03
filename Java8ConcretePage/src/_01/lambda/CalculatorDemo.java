package _01.lambda;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator cal = (int k, int n) -> k + n;
		int result = cal.add(10, 20);
		System.out.println(result);
	}
}

@FunctionalInterface
interface Calculator {
	public int add(int n1, int n2);
}
