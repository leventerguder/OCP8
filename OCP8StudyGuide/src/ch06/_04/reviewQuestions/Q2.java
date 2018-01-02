package ch06._04.reviewQuestions;

public class Q2 {

}

class StuckTurkeyCage implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	// handle or declare
	public static void main(String[] args) {
		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println("put turkeys in");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}