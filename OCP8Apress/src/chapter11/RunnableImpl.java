package chapter11;

class RunnableImpl implements Runnable {
	public void run() {
		System.out.println("In run(); thread name is: " + Thread.currentThread().getName());
	}

	public static void main(String args[]) throws Exception {
		Thread myThread = new Thread(new RunnableImpl());
		myThread.start();
		System.out.println("In main(); thread name is: " + Thread.currentThread().getName());
		
		//
		Thread myThread2 = new Thread(new RunnableImpl());
		myThread2.start();
	}
}