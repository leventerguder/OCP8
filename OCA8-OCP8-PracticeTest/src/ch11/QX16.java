package ch11;

public class QX16 {
	private static int numShovels;
	private int numRakes;

	public static int getNumShovels() {
		return numShovels;
	}

	public static int getNumRakes() {
		//return numRakes; //compiler error
		return 0;
	}
}

// Which methods compile?
// C Both methods