package ch14;

import java.util.function.UnaryOperator;

public class QX18 {
	public static void main(String[] wood) {
		Doll.open(s -> {
			if (s.layer <= 0)
				return null;
			else
				return new Doll(s.layer--);
		}, new Doll(5));
	}
}

class Doll {
	int layer;

	public Doll(int layer) {
		super();
		this.layer = layer;
	}

	public static void open(UnaryOperator<Doll> task, Doll doll) {
		// The method accept(Doll) is undefined for the type UnaryOperator<Doll>
		// while ((doll = task.accept(doll)) != null) {
		// System.out.print("X");
		// }

		while ((doll = task.apply(doll)) != null) {
			System.out.print("X");
		}
	}
}