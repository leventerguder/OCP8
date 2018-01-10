package chapter11._08.copyOnWriteList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyingList {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator<String> listIter = aList.iterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
			aList.add("four");
			//aList.remove(0);
		}

		// java.util.ConcurrentModificationException
	}
}