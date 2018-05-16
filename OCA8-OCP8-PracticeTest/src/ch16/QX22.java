package ch16;

public class QX22 {

	public static void main(String[] args) {
		try (final AutoCloseable weatherTracker = new AutoCloseable() {
			public void close() throws RuntimeException {
			}
		}) {
			System.out.println(weatherTracker.toString());
		} catch (Exception e) {
			//weatherTracker cannot be resolved to a variable
			// compile error
			// if (weatherTracker != null) {
			// weatherTracker.close();
			// }
		}
	}
}
