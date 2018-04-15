package mock;

import java.io.IOException;

public class QX80 {

}

// Which one of the following definitions of the AResource class implementation
// is correct so that it can be used with try-with-resources statement?

class AResource implements AutoCloseable {
	public void close() throws IOException {
		// body of close to release the resource
	}
}