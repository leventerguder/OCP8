package ch04._04.stream.together;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class PipelineTest01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		//
		list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);

		//It actually hangs until you kill the program or it throws an exception after running out of memory. 
		//Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		
		/*
		This one prints Elsa twice. The  lter lets elements through and limit() 
		stops the earlier operations after two elements. Now sorted() can sort because we have a  nite list.
		 */
		Stream.generate(() -> "Elsa") .filter(n -> n.length() == 4) .limit(2).sorted() .forEach(System.out::println);

		
		//This one hangs as well until we kill the program. The  lter doesn’t allow anything through, 
		//so limit() never sees two elements.
		//Stream.generate(() -> "Olaf Lazisson") .filter(n -> n.length() == 4) .limit(2).sorted() .forEach(System.out::println);


	}
}
