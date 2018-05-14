package ch16;

import java.io.IOException;

public class Q9 {

	public static void main(String[] args) throws IOException {

		try {
			new Light().turnOn();
		} catch (Exception b) {
			System.out.println(b);
			throw new IOException(); // y2
		} finally {
			System.out.println("complete");
		}
	}
}

class Light {
	public void turnOn() throws IOException {
		new IOException("Not ready");
	}
}