package ch23;

import java.io.IOException;
import java.io.Reader;

public class QX51 {

	// Let’s say we have a Reader instance that will produce the characters with
	// the numeric values {1,2,3,4,5,6,7}. Which of the following are possible
	// outcomes of executing the checkLottoNumbers() method with this Reader
	// instance? (Choose two.)

	public String checkLottoNumbers(Reader r) throws IOException {
		r.read();
		r.skip(1);
		r.mark(5);
		r.skip(1);
		r.reset();
		return r.read() + "-" + r.read(new char[5]);
	}
}
