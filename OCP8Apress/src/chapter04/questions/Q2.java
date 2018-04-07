package chapter04.questions;

import java.util.*;

class Q2 {
	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<>();
		List<Double> dblList = new LinkedList<>();
		System.out.println("First type: " + intList.getClass());
		System.out.println("Second type:" + dblList.getClass());
	}
}
// First type: class java.util.LinkedList
// Second type:class java.util.LinkedList