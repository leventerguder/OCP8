package mock;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class QX47 {

	public static void main(String[] args) {
		Set<String> set = new CopyOnWriteArraySet<String>(); // #1
		set.add("2");
		set.add("1");
		Iterator<String> iter = set.iterator();
		set.add("3");
		set.add("-1");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
