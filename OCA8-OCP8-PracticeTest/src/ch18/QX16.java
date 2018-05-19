package ch18;

import java.io.*;

public class QX16 {

	public void resetWorkingDirectory() throws Exception {
		File f1 = new File("/templates/proofs");
		f1.mkdirs();
		File f2 = new File("/templates");
		f2.mkdir(); // k1
		new File(f2, "draft.doc").createNewFile();
		f1.delete();
		f2.delete(); // k2
	}

	public static void main(String... leads) {
		try {
			new QX16().resetWorkingDirectory();
		} catch (Exception e) {
			new RuntimeException(e); // watch out not throw!
		}
	}
}
