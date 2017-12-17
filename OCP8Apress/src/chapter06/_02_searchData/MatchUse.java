package chapter06._02_searchData;

import java.util.stream.IntStream;

public class MatchUse {

	public static void main(String[] args) {
		boolean anyMatch = IntStream.of(-56, -57, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
		System.out.println("anyMatch : " + anyMatch);
		//
		boolean allMatch = IntStream.of(-56, -57, -52, -48, -51, -49).allMatch(temp -> temp > 0);
		System.out.println("allMatch : " + allMatch);
		//
		boolean noneMatch = IntStream.of(-56, -57, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
		System.out.println("noneMatch : " + noneMatch);
		
		System.out.println("empty check");
		System.out.println(IntStream.of().anyMatch(temp -> temp >0));
		System.out.println(IntStream.of().allMatch(temp -> temp >0));
		System.out.println(IntStream.of().noneMatch(temp -> temp >0));
	}
}
