package ch03._04.comparator;

import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {

	@Override
	public int compare(Squirrel s1, Squirrel s2) {
		int result = s1.getSpecies().compareTo(s2.getSpecies());
		if (result != 0)
			return result;
		return s1.getWeight() - s2.getWeight();
	}
}