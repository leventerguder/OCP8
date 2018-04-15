package mock;

import java.io.File;

public class QX65 {

	public static void main(String[] args) {
		String[] fileList = { "/file1.txt", "/subdir/file2.txt", "/file3.txt" };
		for (String file : fileList) {
			try {
				new File(file).mkdirs();
			} catch (Exception e) {
				System.out.println("file creation failed");
				System.exit(-1);
			}
		}
	}
}
