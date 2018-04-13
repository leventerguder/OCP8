package chapter10._09.questions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		//
		Path path = Paths.get("D:\\directory\\file.txt");
		
		// in the while loop , you use iterator() to get a temporary iterator object.
		// while (path.iterator().hasNext()) {
		// System.out.println("path element: " + path.iterator().next());
		// }
		
		Iterator<Path> paths = path.iterator();
		while(paths.hasNext()) {
			System.out.println("path element: " + paths.next());
		}

	}

}