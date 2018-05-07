package ch13;

import java.util.Set;
import java.util.TreeSet;

public class QX12 {
	public static void main(String[] args) {
		//
		Set<Magazine> set = new TreeSet<>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		//
		// java.lang.ClassCastException
		System.out.println(set.iterator().next());

	}
}

class Magazine {
	private String name;

	public Magazine(String name) {
		this.name = name;
	}

	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}

	public String toString() {
		return name;
	}
}