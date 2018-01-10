package chapter11._08.copyOnWriteList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWList {
	public static void main(String[] args) {
		List<String> aList = new CopyOnWriteArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator<String> listIter = aList.iterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
			aList.add("four");
		}
		
		System.out.println(aList);
	}
}