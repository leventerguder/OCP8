package mock;

class ReadDevice implements AutoCloseable {
	public void read() throws Exception {
		System.out.print("read; ");
		throw new Exception();
	}

	public void close() throws Exception {
		System.out.print("closing ReadDevice; ");
	}
}

class WriteDevice implements AutoCloseable {
	public void write() {
		System.out.print("write; ");
	}

	public void close() throws Exception {
		System.out.print("closing WriteDevice; ");
	}
}

public class QX69 {

	public static void main(String[] args) {
		try (ReadDevice rd = new ReadDevice(); WriteDevice wd = new WriteDevice()) {
			rd.read();
			wd.write();
		} catch (Exception e) {
			System.out.print("Caught exception; ");
		}
	}
}

// The read() method of ReadDevice throws an exception, and hence the write()
// method of WriteDevice is not called. The try-with-resources statement
// releases the resources in the reverse order from which they were acquired.
// Hence, the close() for WriteDevice is called first, followed by the call to
// the close() method forReadDevice.Finally,thecatchblockprints“Caught
// exception;”totheconsole.
