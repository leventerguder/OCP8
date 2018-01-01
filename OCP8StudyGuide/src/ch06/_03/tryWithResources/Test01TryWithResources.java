package ch06._03.tryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01TryWithResources {

	public static void main(String[] args) {

	}

	public void oldApproach() throws IOException {

		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader("read.txt"));
			out = new BufferedWriter(new FileWriter("read.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Old approach
			// If in.close() throws an exception, then out.close() will never be
			// executed,
			if (in != null)
				in.close();
			if (out != null)
				out.close();

		}
	}

	public void oldApproachEnsuring() throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader("read.txt"));
			out = new BufferedWriter(new FileWriter("read.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Old approach ensuring
			try {
				in.close();
			} catch (IOException e) {
			}
			try {
				out.close();
			} catch (IOException e) {
			}
		}
	}

	public void newApproach() throws FileNotFoundException, IOException {

		try (BufferedReader in = new BufferedReader(new FileReader("read.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("read.txt"))) {

		}

		/*
		 * The new try-with-resources statement automatically closes all
		 * resources opened in the try clause. This feature is also known as
		 * automatic resource management, because Java automatically takes care
		 * of the closing.
		 */

	}
}
