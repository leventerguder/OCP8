package ch06._04.reviewQuestions;

import java.io.*;

public class Q5 {
	static class Door implements AutoCloseable {
		public void close() {
			System.out.print("D");
			throw new RuntimeException("Dog#runtime");
		}
	}

	static class Window implements Closeable {
		public void close() {
			System.out.print("W");
			throw new RuntimeException("window#runtime");
		}
	}

	public static void main(String[] args) {
		try (Door d = new Door(); Window w = new Window()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
			System.out.println("\nexception :  " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}

		} finally {
			System.out.print("F");
		}
	}
}