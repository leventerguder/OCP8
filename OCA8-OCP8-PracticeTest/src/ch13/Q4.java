package ch13;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.TreeSet;

public class Q4 {

	public static void main(String[] args) {
		
		Collection<String> c = new TreeSet<>();
		c.add("pen");
		c.remove("pen"); 
		System.out.println(c.isEmpty());
		
		c = new ArrayDeque<>();
		
	}
}
