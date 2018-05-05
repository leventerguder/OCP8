package ch07._16.reviewQuestions;

import java.util.concurrent.Callable;

public class QX15 {

	// Which of the following are valid Callable expressions? (Choose all that
	// apply.)

	// A. a -> {return 10;}
	// B. () -> {String s = "";}
	// C. () -> 5 (+)
	// D. () -> {return null} (+)
	// E. () -> "The" + "Zoo" (+)
	// F. (int count) -> count+1
	// G. () -> {System.out.println("Giraffe"); return 10;} (+)

	public static void main(String[] args) {
		// java.util.concurrent.Callable<V>
		// V call() throws Exception
		Callable c1 = () -> 5;
		Callable c2 = () -> "The" + "Zoo";
		Callable c3 = () -> {
			System.out.println("Giraffe");
			return 10;
		};
	}
}
