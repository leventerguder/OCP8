package chapter06._06_saveResult;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsTest01List {

	public static void main(String[] args) {
		List<String> list = Pattern.compile(",").splitAsStream("in,java,we,trust,.com").collect(Collectors.toList());
		
		System.out.println(list.getClass());
		list.forEach(System.out::println);
	}
}
