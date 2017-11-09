package ch03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(100);
		stack.add(150);
		stack.add(50);
		stack.push(200);
		//
		
		System.out.println(stack);
		System.out.println(stack.pop());
	}
}
