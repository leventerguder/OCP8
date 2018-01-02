package ch06._04.reviewQuestions;

public class QX16 {
	static class Walk implements AutoCloseable {
		public void close() {
			System.out.println("Walk#close");
			throw new RuntimeException("snow");
		}
	}

	public static void main(String[] args) {
		try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
			System.out.println("in-try");
			throw new RuntimeException("rain");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}
}

// snow
