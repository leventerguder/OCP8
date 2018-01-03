package ch08._01.reviewQuestions;

import java.io.IOException;
import java.io.InputStream;

public class QX23 {
	public static String pullBytes(InputStream is, int count) throws IOException {
		is.mark(count);
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++)
			sb.append((char) is.read());
		is.reset();
		is.skip(1);
		sb.append((char) is.read());
		return sb.toString();
	}
}

//// Assume that you have an InputStream whose next bytes are XYZABC. What is
//// the result of calling the following method on the stream, using a count
//// value of 3?

/*
 * H. Not all java.io streams support the mark() operation; therefore, without
 * calling markSupported() on the stream, the result is unknown until runtime.
 * 
 * If the stream does support the mark() operation, then the result would be
 * XYZY, because the reset() operation puts the stream back in the position
 * before the mark() was called, and skip(1) will skip X, and E would be ( It will return a String value of XYZY.)
 * correct. If the stream does not support the mark() operation, a runtime
 * exception would likely be thrown, and G would be correct. Since you don’t
 * know if the input stream supports the mark() operation, H is the only correct
 * choice.
 */
