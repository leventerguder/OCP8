package ch04._07.reviewQuestions;

import java.util.stream.Stream;

public class Q6 {

	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "meow");
		boolean match = s.allMatch(String::isEmpty);
		System.out.println(match);
		
		// allMatch , 1 tane bile sart saglanmiyorsa infinite'ten cikar. false

		// Stream<String> s2 = Stream.generate(() -> "meow");
		// boolean match2 = s2.anyMatch(String::isEmpty); // hang!
		// System.out.println(match2);
		
		// anyMatch ,sart saglanmayacagi icin sonsuzdan cikamaz. hic eslesen yok.
		
		// Stream<String> s3 = Stream.generate(() -> "meow");
		// boolean match3 = s3.noneMatch(String::isEmpty); // hang!
		// System.out.println(match3);
		
		//noneMatch ,hic eslesmeyeni bulamayacagi icin sonsuzdan cikamaz.
	}
}
