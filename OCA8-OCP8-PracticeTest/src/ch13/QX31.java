package ch13;

import java.util.ArrayDeque;

public class QX31 {

	public static void main(String[] args) {
		//
		ArrayDeque<Integer> dice = new ArrayDeque<>();
		dice.offer(3);
		dice.offer(2);
		dice.offer(4);
		
		System.out.println(dice);
		
		System.out.print(dice.stream().filter(n -> n != 4));
		// java.util.stream.ReferencePipeline$2@e9e54c2
	}
}
