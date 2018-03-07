package ch07._01.runnable;

class PrintData implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("i : " + i);
		}

		System.out.println(Thread.currentThread().getName());
	}

}

public class Test02Runnable {

	public static void main(String[] args) {
		new Thread(new PrintData()).start();
	}
}
