package ch03._04.comparator;

import java.util.Comparator;

public class DuckComparator {

	public static void main(String[] args) {
		Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
		Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
		//
		Comparator<Duck> byName = (d1, d2) -> DuckHelper.compareByName(d1, d2);
		Comparator<Duck> byName2 = DuckHelper::compareByName;
	}
}
