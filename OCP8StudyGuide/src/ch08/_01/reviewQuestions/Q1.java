package ch08._01.reviewQuestions;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Q1 {

	public static void main(String[] args) throws FileNotFoundException {
		// BufferedInputStream extends FilterInputStream
		// public class FilterInputStream extends InputStream
		// public class FileInputStream extends InputStream
		// public class ObjectInputStream extends InputStream
		InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
		// InputStream wrapper = new ObjectInputStream(is);

		// public abstract class InputStream implements Closeable
		InputStream wrapper = new BufferedInputStream(is);
	}
}
