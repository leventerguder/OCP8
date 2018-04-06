package chapter03.questions;

@FunctionalInterface
interface LambdaFunction {
	
	int apply(int j);

	boolean equals(java.lang.Object arg0);
}

public class QX10 {
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = i -> i * i;
		System.out.println(lambdaFunction.apply(10));
	}
}
