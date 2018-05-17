package ch16;

public class QX32 {

	class Player implements AutoCloseable {
		@Override
		public void close() throws RingException {
		}
	}

	class RingException extends Exception {
		public RingException(String message) {
		}
	}

	public static void main(String[] args) {
		try (Player p = null) {
			throw new Exception();
		} catch (Exception e) {
		} catch (Error r) {

		}
		// A Error r
	}
}
