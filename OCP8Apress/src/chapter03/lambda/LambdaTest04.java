package chapter03.lambda;

import java.io.IOException;

interface LambdaThrowsException {
	void call() throws IOException;
}

interface LambdaNotThrowsException {
	void call();
}

public class LambdaTest04 {

	public static void main(String[] args) {

		LambdaThrowsException lambda1 = () -> {
			// if a lambda expression throws checked exception , then the ethod
			// in the functional interface should declare that
			throw new IOException();
		};
		
		try {
			lambda1.call(); //handle or declare
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		LambdaNotThrowsException lambda2 = () -> {
			try {
				throw new IOException();
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
	}
}
