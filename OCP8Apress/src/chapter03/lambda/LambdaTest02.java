package chapter03.lambda;

interface LambdaFunction2 {
	String call(int i);
}

public class LambdaTest02 {

	public static void main(String[] args) {
		LambdaFunction2 lambda = (int i) -> {
			if (i % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}
		};

		lambda.call(20);
	}

}
