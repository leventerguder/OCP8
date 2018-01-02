package ch06._04.reviewQuestions;

public class QX14 {
	static class SneezeException extends Exception {
	}

	static class SniffleException extends SneezeException {
	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} // catch (SneezeException | SniffleException e) { // NOT legal
		catch (SneezeException e) {
			System.out.println("catch");
			throw e;
		}
	}
}
