package _01.lambda;

import java.util.function.BinaryOperator;

public class Example03 {

	public static void main(String[] args) {
		BinaryOperator<Long> add = (x, y) -> x + y;
		Long value = add.apply(10L, 20L);
		System.out.println(value);
		
		BinaryOperator<Long> add2 =  (Long x , Long y) -> x+y+10;
		Long value2 = add2.apply(20L, 30L);
		System.out.println(value2);
	}
}
