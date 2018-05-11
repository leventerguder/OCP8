package ch15;

import java.util.Arrays;
import java.util.Collection;

//Which of the following fills in the blank so that the code outputs one line but uses a poor practice?
public class Q1 {

	int count = 0;

	public static void main(String[] args) {
		Q1 q = new Q1();
		q.sneak(Arrays.asList("weasel"));
	}

	public void sneak(Collection<String> coll) {
		// coll.stream().peek(System.out::println).findFirst();
		// coll.stream().peek(r -> System.out.println(r)).findFirst();
		coll.stream().peek(r -> {
			count++;
			System.out.println(r);
		}).findFirst();
	}
}
