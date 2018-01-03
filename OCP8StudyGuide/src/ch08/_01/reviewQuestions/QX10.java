package ch08._01.reviewQuestions;

import java.io.File;

public class QX10 {
	public static void deleteTree(File file) {
		if (!file.isFile())
			for (File entry : file.listFiles())
				deleteTree(entry);
		else
			file.delete();
	}
}
