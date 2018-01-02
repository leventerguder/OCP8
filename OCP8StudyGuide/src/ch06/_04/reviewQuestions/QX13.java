package ch06._04.reviewQuestions;

public class QX13 {
	static class SneezeException extends Exception {
	}

	static class SniffleException extends SneezeException {
	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException | RuntimeException e) {
			// multi catch is effectively final
			// The parameter e of a multi-catch block cannot be assigned
			// e = new RuntimeException();
			// e = new SneezeException();
			// e = new SniffleException();
			// NOT LEGAL , Compiler error!
		}
	}
}
