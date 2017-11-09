package ch03;

import java.util.Comparator;

public class DuckComparator {

	public static void main(String[] args) {
		Comparator<Duck> byWeight = (d1,d2) -> DuckHelper.compareByWeight(d1, d2);
		Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
	}
}
