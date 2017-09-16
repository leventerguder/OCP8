package chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class StreamErrTest01 {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream("error.txt");
		System.setErr(new PrintStream(os));
		System.err.println("error!");
	}
}
