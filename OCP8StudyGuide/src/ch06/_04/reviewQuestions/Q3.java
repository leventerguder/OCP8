package ch06._04.reviewQuestions;

import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException | RuntimeException e) {
		}
	}
}
