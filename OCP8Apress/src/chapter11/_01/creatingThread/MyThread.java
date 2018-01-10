package chapter11._01.creatingThread;

public class MyThread extends Thread {
	public void run() {
		try {
			System.out.println("before sleep");
			sleep(1000);
			System.out.println("after sleep");
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException ex) {
			ex.printStackTrace();
			// ignore the InterruptedException - this is perhaps the one of the
			// very few of the exceptions in Java which is acceptable to ignore
		}
		System.out.println("In run(); thread name is: " + getName());
	}

	public static void main(String args[]) {
		Thread myThread = new MyThread();
		myThread.start();
		System.out.println("In main(); thread name: " + Thread.currentThread().getName());
	}
}