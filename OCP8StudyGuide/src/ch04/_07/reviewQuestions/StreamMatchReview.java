package ch04._07.reviewQuestions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMatchReview {

	public static void main(String[] args) {

		// 1 )
		// allMatch -> butun elemanlar eslemesli , bir tane bile eslesmezse
		// false , islem tamam.

		// infinite stream icin bir tane eslezmezse bu durumda sonlanir.

		// 2 )
		// anyMatch -> bir tane bile eslesme varsa islem tamam. true doner.
		// sonsuz dongude elemanlar hic eslesmiyorsa sonsuza gider , code hangs
		//
		// 3)
		// noneMatch -> butun elemanla eslesmemeli.
		// bir tane eslesirsa false doner
		// sonsuz dongude hic eslesmiyorsa sonsuza gider , code hangs.

		Stream<String> infinite = Stream.generate(() -> "infinite");
		Predicate<String> p1 = str -> str.startsWith("java");

		System.out.println(infinite.allMatch(p1)); // false !
		/*
		 * Returns whether all elements of this stream match the provided
		 * predicate. May not evaluate the predicate on all elements if not
		 * necessary for determining the result. If the stream is empty then
		 * true is returned and the predicate is not evaluated.
		 * 
		 * This is a short-circuiting terminal operation
		 */

		// infinite.anyMatch(p1); //
		/*
		 * Returns whether any elements of this stream match the provided
		 * predicate. May not evaluate the predicate on all elements if not
		 * necessary for determining the result. If the stream is empty then
		 * false is returned and the predicate is not evaluated. This is a
		 * short-circuiting terminal operation.
		 * 
		 */

		// infinite.noneMatch(p1);
		/*
		 * Returns whether no elements of this stream match the provided
		 * predicate. May not evaluate the predicate on all elements if not
		 * necessary for determining the result. If the stream is empty then
		 * true is returned and the predicate is not evaluated.
		 * 
		 * This is a short-circuiting terminal operation.
		 */

	}
}
