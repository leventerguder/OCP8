package chapter07._03_questions;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		try (Scanner consoleScanner = new Scanner(System.in)) {
			consoleScanner.close(); // CLOSE
			consoleScanner.close();
		}
	}
}
// This program terminates normally without throwing any exceptions