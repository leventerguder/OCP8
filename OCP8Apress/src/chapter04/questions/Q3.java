package chapter04.questions;

import java.util.Arrays;

class Q3 {
	public static void main(String[] args) {
		String[] brics = { "Brazil", "Russia", "India", "China" };
		Arrays.sort(brics, null); // LINE A
		for (String country : brics) {
			System.out.print(country + " ");
		}
	}
}
// Brazil China India Russia 