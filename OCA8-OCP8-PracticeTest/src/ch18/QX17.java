package ch18;

import java.io.File;

public class QX17 {

	public static void main(String[] args) {

		Store s = new Store("dir");
		File f1 = s.getDatabaseFolder("file.txt");
		//
		System.out.println(f1);
	}
}

class Store {

	private final String directory;

	public Store(String directory) {
		this.directory = directory;
	}

	public File getDatabaseFolder(String file) {
		return new File(directory + System.getProperty("file.separator") + file);
	}
}

