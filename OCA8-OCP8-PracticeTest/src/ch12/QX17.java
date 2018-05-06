package ch12;

public class QX17 {

	public static final void apply(Bend instruction, double input) { // r1
		instruction.bend(input);
	}

	public static void main(String... future) {
		final QX17 r = new QX17();
		//r.apply(x -> System.out.print(x + " bent!"), 5);
		// The code does not compile because Bend is not a functional interface.
	}

}

interface Pump {
	void pump(double psi);
}

interface Bend extends Pump {
	void bend(double tensileStrength);
}