package ch03._02.generics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class WildCard {

	public static void showSize(List<?> list) {
		System.out.println(list.size());
	}

	public static void main(String[] args) {
		ArrayDeque<?> queue = new ArrayDeque<>();
		// showSize(queue); //compiler error
		//
		ArrayList<? super Date> list2 = new ArrayList<Date>();
		showSize(list2);
		//
		Vector<? extends Number> vector = new Vector<Integer>();
		showSize(vector);
	}
	
	public static <T> T identity(T t) { return t;
	}
}
