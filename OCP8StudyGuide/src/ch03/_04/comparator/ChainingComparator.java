package ch03._04.comparator;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {
	public int compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparingInt(s -> s.getWeight());
		return c.compare(s1, s2);
	}
}