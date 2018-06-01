package ch23;

import java.util.stream.Stream;

public class QX62 {

	public static void main(String[] args) {
		Integer result = Stream.of(getNums(9,8), getNums(22,33))
				//.filter(x -> !x.isEmpty()) //compile error
				.flatMap(x->x)
				.max((a, b) -> a - b)
				.get();
		
		System.out.println(result);
				
	}
	
	private static Stream<Integer> getNums(int num1, int num2){
		return Stream.of(num1,num2);
	}
}