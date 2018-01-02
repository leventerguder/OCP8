package ch06._04.reviewQuestions;

public class QX12 {
	static class SneezeException extends Exception {
	}

	static class SniffleException extends SneezeException {
	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException e) {
			e = new SneezeException();
			e = new SniffleException();
			throw e;
		}
	}
}