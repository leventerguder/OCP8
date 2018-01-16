package ch07._01.runnable;

public class Test01Runnable {

	public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("hello world");
		
		r1.run();
	}

}
