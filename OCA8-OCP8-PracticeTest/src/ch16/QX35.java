package ch16;

public class QX35 {

}

class Tale {
	class BearException extends RuntimeException {
	}

	class WolfException extends RuntimeException {
	}

	class DragonException extends RuntimeException {
	}

	public int tellStory() {
		try {
		} catch (BearException d) {
			// d = new RuntimeException();
			throw d;
		} catch (WolfException | DragonException e) {
			// The parameter e of a multi-catch block cannot be assigned
			// e = new RuntimeException();
			throw e;
		}
		return 3;
	}

}