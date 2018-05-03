package ch07._01.runnable;

public class Test01Runnable {

	public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("hello world");
		Runnable r2 = () -> {
			int i = 10;
			i++;
		};
		Runnable r3 = () -> {
			return;
		};
		Runnable r4 = () -> {
		};

		r1.run();
		r2.run();
		r3.run();
		r4.run();
	}

}

// The Runnable interface is commonly used to define the work a thread will
// execute,separate from the main application thread.