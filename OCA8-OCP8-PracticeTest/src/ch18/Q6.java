package ch18;

import java.io.*;

public class Q6 {
	public void sendAlert(File fn) {
//		try (BufferedWriter w = new BufferedWriter(new FileOutputStream(fn))) { // compile error
//			w.write("ALERT!");
//			w.flush();
//			w.write('!');
//			System.out.print("1");
//		} catch (IOException e) {
//			System.out.print("2");
//		} finally {
//			System.out.print("3");
//		}
	}

	public static void main(String[] testSignal) {
		//new Smoke().sendAlert(new File("alarm.txt"));
	}
}
