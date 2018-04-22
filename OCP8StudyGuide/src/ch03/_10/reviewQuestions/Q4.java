package ch03._10.reviewQuestions;

import java.util.ArrayDeque;

public class Q4 {

	public static void main(String[] args) {
		//
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		// 
		System.out.println(greetings);
		greetings.pop();
		greetings.peek();
		while (greetings.peek() != null)
			System.out.print(greetings.pop());
	}
}
