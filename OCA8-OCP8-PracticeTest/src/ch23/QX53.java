package ch23;

public class QX53 {

	// Assuming the following program is executed with assertions enabled, which
	// is the first line to throw an exception at runtime?

	public int checkClasswork(int choices) {
		assert choices++ == 10 : 1;
		assert true != false : new StringBuilder("Answer2");
		assert (null == null) : new Object();
		assert ++choices == 11 : "Answer4";
		assert 2 == 3 : "";
		return choices;
	}

	public final static void main(String... students) {
		try {
			new QX53().checkClasswork(10);
		} catch (Error e) {
			System.out.print("Bad idea");
			throw e;
		}
	}
}
