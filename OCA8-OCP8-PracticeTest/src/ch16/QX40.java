package ch16;

public class QX40 {
	public static void main(String... rocks) {
		try {
			new Cliff().climb();
		} catch (Throwable t) {
			System.out.println(t); // e1
			// java.lang.RuntimeException
		}
	}
}

final class FallenException extends Exception {
}

final class HikingGear implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new FallenException();
	}
}

class Cliff {
	public final void climb() throws Exception {
		try (HikingGear gear = new HikingGear()) {
			throw new RuntimeException();
		}
	}
}