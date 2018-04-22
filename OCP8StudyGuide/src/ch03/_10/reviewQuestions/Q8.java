package ch03._10.reviewQuestions;

import java.util.TreeSet;

public class Q8 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));
	}
}
