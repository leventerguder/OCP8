package _01.lambda;

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Lambda Expression!");
		r.run();
	}
}
