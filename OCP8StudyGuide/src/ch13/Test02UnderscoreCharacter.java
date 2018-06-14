package ch13;

public class Test02UnderscoreCharacter {

	public static void main(String[] args) {

		int million1 = 1_000_000;
		// System.out.println(notAtStart);

		// double notAtStart = _1000.00; // DOES NOT COMPILE
		// double notAtEnd = 1000.00_; // DOES NOT COMPILE
		// double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0;
	}
}
