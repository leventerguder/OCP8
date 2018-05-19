package ch18;

import java.io.*;

public class QX29 {

	public void copyPidgin(File s, File t) throws Exception {
		try (InputStream is = new FileInputStream(s); OutputStream os = new FileOutputStream(t)) {
			byte[] data = new byte[123];
			int chirps;
			while ((chirps = is.read(data)) > 0) {
				os.write(data);
			}
		}
	}
}
