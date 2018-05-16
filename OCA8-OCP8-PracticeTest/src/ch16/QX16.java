package ch16;

import ch16.Beach.TideException;

public class QX16 {

}

class Beach {

	class TideException extends Exception {
	}

	public void surf() throws RuntimeException {

		try {
			throw new TideException();
		} catch (IllegalStateException | TideException t) {
		}

	}

}