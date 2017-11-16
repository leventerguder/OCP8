package ch03;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));
		System.out.println(tree.ceiling("One"));
		System.out.println(tree.higher("On"));
		System.out.println(tree.higher("One"));
	}
}
