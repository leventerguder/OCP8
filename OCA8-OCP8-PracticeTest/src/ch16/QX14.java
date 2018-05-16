package ch16;

class MissingMoneyException extends Exception {
}

class MissingFoodException extends Exception {
}

public class QX14 {

	public static void main(String[] args) throws MissingMoneyException, MissingFoodException {
		try {
			final Problems p = new Problems();
			p.doIHaveAProblem();
		} catch (Exception e) {
			throw e;
		}
	}
}

class Problems {
	public void doIHaveAProblem() throws MissingMoneyException, MissingFoodException {
		System.out.println("No problems");
	}
}
