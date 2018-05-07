package ch13;

import java.util.ArrayDeque;

public class QX11 {

	public static void main(String[] args) {
		//
		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.offer(18); // 18
		d.offer(5); // 18 5
		d.push(13); // 13 18 5
		
		System.out.println(d);
		
		System.out.println(d.poll() + " " + d.pop());
	}
}
