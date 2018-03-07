package ch07._01.runnable;

public class Test03Sleep {

	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			for (int i = 0; i < 50000000; i++)
				Test03Sleep.counter++;
		}).start();

		while (Test03Sleep.counter < 100000) {
			System.out.println("Not reached yet");
			 Thread.sleep(1000); // 1 SECOND
		}
		System.out.println("Reached!");
	}
}
// How many times will the while() loop in this code execute and output Not
// reached yet? The answer is, we don’t know!

// How many times does the while() loop execute in this revised class? (Thread.sleep(1000)) 
//Still unknown! While polling does prevent the CPU from being overwhelmed with a
// potentially in nite loop,