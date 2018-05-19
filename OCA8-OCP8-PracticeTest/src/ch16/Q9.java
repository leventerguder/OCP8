package ch16;

import java.io.IOException;

public class Q9 {

	public void turnOn() throws IOException {
		new IOException("Not ready");
	}

	public static void main(String[] b) throws Exception {
	//		try {
	//			new Light().turnOn();
	//		} catch (RuntimeException b) { // y1 //duplicate parameter
	//			System.out.println(b);
	//			throw new IOException(); // y2
	//		} finally {
	//			System.out.println("complete");
	//		}
	}
}

class Light {
	public void turnOn() throws IOException {
		new IOException("Not ready");
	}
}