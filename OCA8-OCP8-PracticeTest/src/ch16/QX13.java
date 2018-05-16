package ch16;

public class QX13 {

	public final static void main(String[] args) {
		try {
			if (!"cat".equals("kat")) {
				new SpellingException(); // not throw!
			}
		} catch (SpellingException | NullPointerException e) {
			System.out.println("Spelling problem!");
		} catch (Exception e) {
			System.out.println("Unknown Problem!");
		} finally {
			System.out.println("Done!");
		}
	}
}

class SpellingException extends RuntimeException {
}