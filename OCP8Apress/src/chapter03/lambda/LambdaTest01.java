package chapter03.lambda;

interface LambdaFunction {
	void call();
}

public class LambdaTest01 {

	public static void main(String[] args) {
		LambdaFunction lambda = () -> System.out.println("hello lambda - 1!");
		lambda.call();
		System.out.println(lambda.getClass());

		LambdaFunction lambda2 = () -> {
			System.out.println("hello lambda - 2-line1!");
			System.out.println("hello lambda - 2-line2!");
		};
		lambda2.call();
		System.out.println(lambda2.getClass());
	}
}
