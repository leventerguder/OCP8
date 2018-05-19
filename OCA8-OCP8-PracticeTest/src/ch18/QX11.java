package ch18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class QX11 {
	public void writeSecret1() throws IOException {
		final Writer w = new BufferedWriter(new FileWriter("dont.open"));
		w.write("Secret passcode");
		w.close();
	}

	public void writeSecret2() throws IOException {
		try (final Writer w = new BufferedWriter(new FileWriter("dont.open"))) {
			w.write("Secret passcode");
		}
	}
}

// The methods compile, but one method may lead to a resource leak.