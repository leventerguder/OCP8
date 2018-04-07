package chapter06._02_searchData;

import java.util.stream.IntStream;

public class Test01MatchUse {

	public static void main(String[] args) {
		//
		// boolean anyMatch(Predicate<? super T> predicate);
		// boolean allMatch(Predicate<? super T> predicate);
		// boolean noneMatch(Predicate<? super T> predicate);
		//
		boolean anyMatch = IntStream.of(-56, -57, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
		System.out.println("anyMatch : " + anyMatch);

		boolean anyMatch2 = IntStream.of(-56, -57, -52, -48, -51, -49, 1).anyMatch(temp -> temp > 0);
		System.out.println("anyMatch2 : " + anyMatch2);

		//
		boolean allMatch = IntStream.of(-56, -57, -52, -48, -51, -49).allMatch(temp -> temp > 0);
		System.out.println("allMatch : " + allMatch);

		boolean allMatch2 = IntStream.of(56, 57, 52, 48, 51, 49).allMatch(temp -> temp > 0);
		System.out.println("allMatch2 : " + allMatch2);
		//
		boolean noneMatch = IntStream.of(-56, -57, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
		System.out.println("noneMatch : " + noneMatch);

		boolean noneMatch2 = IntStream.of(-56, -57, -52, -48, -51, -49, 1).noneMatch(temp -> temp > 0);
		System.out.println("noneMatch2 : " + noneMatch2);

		System.out.println("empty check");
		System.out.println(IntStream.of().anyMatch(temp -> temp > 0));
		System.out.println(IntStream.of().allMatch(temp -> temp > 0));
		System.out.println(IntStream.of().noneMatch(temp -> temp > 0));

		// Unlike the anyMatch() method that returns false when the stream is
		// empty, the allMatch() and noneMatch( ) methods return true if the
		// stream is empty!
	}
}

// The allMatch() method returns true for an empty stream and does not
// evalute the given predicate. Hence this program prints true.

// https://stackoverflow.com/questions/30223079/why-does-stream-allmatch-return-true-for-an-empty-stream
