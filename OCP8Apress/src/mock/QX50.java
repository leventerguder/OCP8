package mock;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class QX50 {

	public static void main(String[] args) {
		Path aFilePath = Paths.get("D:\\dir\\file.txt");
		Iterator<Path> paths = aFilePath.iterator();
		while (paths.hasNext()) {
			System.out.print(paths.next() + " ");
		}
	}
}
