package chapter09.questions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Q1 {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream("log.txt");
		System.setErr(new PrintStream(os));
		System.err.println("Error!");
	}
}
