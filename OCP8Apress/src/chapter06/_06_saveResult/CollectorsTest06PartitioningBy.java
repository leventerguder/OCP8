package chapter06._06_saveResult;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;

public class CollectorsTest06PartitioningBy {

	public static void main(String[] args) {
		String[] string = "you never know what you have until you clean your room".split(" ");
		Stream<String> distinctWords = Arrays.stream(string).distinct();
		Map<Boolean,List<String>> wordBlocks = distinctWords.collect(Collectors.partitioningBy(str -> str.length()>4));
		//
		System.out.println("len<=4 : " + wordBlocks.get(false));
		System.out.println("len>4 : " + wordBlocks.get(true));
	}
}
