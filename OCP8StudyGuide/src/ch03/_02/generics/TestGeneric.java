package ch03._02.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<Integer>();
		
		//testMethod(list); //compiler error
		
		testMethod2(list);
		testMethod3(list);
	}
	
	public static void testMethod(List<Number> list) {
		
	}
	
	public static void testMethod2(List<? extends Number> list) {
		
	}
	
	public static void testMethod3(List<? extends Object> list) {
		
	}
}
