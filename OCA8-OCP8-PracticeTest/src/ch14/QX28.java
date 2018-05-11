package ch14;

import java.util.function.BiFunction;

public class QX28 {

}

class Dance {

	public static Integer rest(BiFunction<Integer, Double, Integer> takeABreak) {
		return takeABreak.apply(3, 10.2);
	}

	public static void main(String[] args) {
		// rest((int n, double e) -> (int)(n+e)); //compile error
		// Lambda expression's parameter n is expected to be of type Integer

		rest((s, e) -> s.intValue() + e.intValue());
	}
}