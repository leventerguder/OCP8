package ch16;

public class QX34 {
	static void makeCall() throws RuntimeException {
		throw new ArrayIndexOutOfBoundsException("Call");
	}

	public static void main(String[] args) {
//		try {
//			makeCall();
//		} catch (MissedCallException e) { // compile error
//			throw new RuntimeException("Voicemail");
//		} finally {
//			throw new RuntimeException("Text");
//		}
	}
}

class MissedCallException extends Exception {
}