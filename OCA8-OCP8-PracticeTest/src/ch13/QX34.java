package ch13;

import java.util.Set;
import java.util.TreeSet;

public class QX34 {

	public static void main(String[] args) {
		//
		Set<MagazineQX34> set = new TreeSet<>();
		set.add(new MagazineQX34("highlights"));
		set.add(new MagazineQX34("Newsweek"));
		set.add(new MagazineQX34("highlights"));
		
		System.out.println(set);
		System.out.println(set.iterator().next());
	}
}

class MagazineQX34 implements Comparable<MagazineQX34> {
	private String name;

	public MagazineQX34(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(MagazineQX34 m) {
		return name.compareTo(m.name);
	}

	@Override
	public String toString() {
		return name;
	}
}