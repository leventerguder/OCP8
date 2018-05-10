package ch13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class QX26 {

	public static void main(String[] args) {

		try {
			ArrayDeque<String> deque = new ArrayDeque<>();
			deque.add(null);
		} catch (Exception e) {
			System.out.println("Not allowed null in ArrayDeque");
		}

		try {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add(null);
		} catch (Exception e) {
			System.out.println("Not allowed null in ArrayList");
		}

		try {
			TreeSet<String> treeSet = new TreeSet<>();
			treeSet.add(null);
		} catch (Exception e) {
			System.out.println("Not allowed null in TreeSet");
		}

	}

}

// 26. Which type allows inserting a null value?

// A. ArrayDeque (+)
// B. ArrayList
// C. TreeSet (+)
// D. All of these allow nulls.