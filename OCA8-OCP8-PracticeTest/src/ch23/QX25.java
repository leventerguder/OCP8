package ch23;

public class QX25 {
	public static void main(String... ticks) {
		new Watch().checkHour();
	}
}
// Which command causes the following class to throw an AssertionError at
// runtime?

// B. java -ea:Watch -da Watch

class Watch {

	private static final short DEFAULT_HOUR = 12;

	Watch() {
		super();
	}

	int checkHour() {
		assert DEFAULT_HOUR > 12;
		return DEFAULT_HOUR;
	}
}
