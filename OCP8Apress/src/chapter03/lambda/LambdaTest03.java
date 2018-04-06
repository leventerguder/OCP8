package chapter03.lambda;

@FunctionalInterface
interface Message {
	void call();
}

public class LambdaTest03 {

	public static void main(String[] args) {
		String word = "hello !";
		// word = word + "not effectively final!";
		Message msg = () -> System.out.println(word + " , java !");
		msg.call();
	}

}
