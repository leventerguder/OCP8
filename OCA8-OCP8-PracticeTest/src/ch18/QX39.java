package ch18;

import java.io.*;

public class QX39 {

	public String receiveText() throws Exception {
		try (Reader r = new FileReader("messages.txt")) {
			StringBuilder s = new StringBuilder();
			int c;
			while ((c = r.read()) != -1) {
				s.append((char) c);
				if (r.markSupported()) {
					r.mark(100);
					r.skip(10);
					r.reset();
				}
			}
			return s.toString();
		}
	}

	public void sendText(String message) throws Exception {
		try (Writer w = new FileWriter("messages.txt")) {
			for (int i = 0; i < message.length(); i++) {
				w.write(message.charAt(i));
				// w.skip(1);
				// D. The code does not compile because of the sendText()
				// method.
			}
		}
	}
}
