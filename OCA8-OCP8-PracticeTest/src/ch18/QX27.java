package ch18;

import java.io.*;

public class QX27 {

	public static void main(String[] args) throws IOException {
		//
		Writer w = new FileWriter("couch.txt");

		try (BufferedWriter bw = new BufferedWriter(w)) {
			bw.write("Blue coach on Sale!");
		} finally {
			w.flush(); // java.io.IOException: Stream closed
			w.close();
		}
		System.out.print("Done!");
	}
}
