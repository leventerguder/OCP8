package ch08._01.reviewQuestions;

import java.io.Console;

public class QX18 {
	public static void main(String[] args) {
		Console console = System.console();
		String color = console.readLine("What is your favorite color? ");
		console.printf("test");
		console.format("test");
		console.writer().println("test");
	}
}
