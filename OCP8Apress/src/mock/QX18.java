package mock;

import java.util.Arrays;
import java.util.Comparator;

public class QX18 {

	public static void main(String[] args) {

		Comparator<String> comparer = (country1, country2) -> country2.compareTo(country2); // WATCH out country(2)
																							// compareTo country(2)
		String[] brics = { "Brazil", "Russia", "India", "China" };
		Arrays.sort(brics, null);
		Arrays.stream(brics).forEach(country -> System.out.print(country + " "));
		//

		System.out.println();
		Arrays.sort(brics, comparer);
		Arrays.stream(brics).forEach(country -> System.out.print(country + " "));

	}
}
