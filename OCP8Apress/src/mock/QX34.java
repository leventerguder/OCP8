package mock;

import java.io.Closeable;
import java.io.IOException;

class CloseableImpl implements Closeable {
	public void close() throws IOException {
		System.out.println("In CloseableImpl.close()");
	}
}

class AutoCloseableImpl implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("In AutoCloseableImpl.close()");
	}
}

public class QX34 {

	public static void main(String[] args) {
		try (	Closeable closeableImpl = new CloseableImpl(); 
				AutoCloseable autoCloseableImpl = new AutoCloseableImpl()) {
		} catch (Exception ignore) {
			// do nothing
		} finally {
			// do nothing
		}
	}
}
