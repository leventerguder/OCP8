package chapter11._13.questions;

// Here is a class named PingPong that extends the Thread class. Which of the following PingPong 
// class implementations correctly prints “ping” from the worker thread and then prints “pong” from the main thread?
public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		Thread pingPong = new PingPong();
		pingPong.start();
		pingPong.join();
		System.out.println("pong");
	}
}

class PingPong extends Thread {
	public void run() {
		System.out.println("ping");
	}
}