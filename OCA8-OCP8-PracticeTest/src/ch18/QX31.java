package ch18;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class QX31 {

	public int getWidgetNumber(byte[] data) throws Exception {
		try (InputStream is = new ByteArrayInputStream(data)) {
			is.read(new byte[2]);
			if (!is.markSupported())
				return -1;
			is.mark(5);
			is.read();
			is.read();
			is.skip(3);
			is.reset();
			return is.read();
		}
	}

	// ByteArrayInputStream does support marks.

	// Two values are read and three are skipped, but then reset() is called,
	// putting the stream back in the
	// state before mark() was called. In other words, everything between mark()
	// and reset() can be ignored.

	public static void main(String... sprockets) throws Exception {
		final QX31 p = new QX31();
		System.out.print(p.getWidgetNumber(new byte[] { 1, 2, 3, 4, 5, 6, 7 }));
	}

}
