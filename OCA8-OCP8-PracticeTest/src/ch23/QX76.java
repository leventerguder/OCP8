package ch23;

import java.io.File;

// Which statement about the following class is true? Assume the file system is available and
// able to be modified.

public class QX76 {
	public static void main(String[] seeds) {
		final CreateTree creator = new CreateTree();
		System.out.print(creator.createTree("/woods/forest"));
		// C. The class compiles but the output cannot be determined until runtime.
	}
}

class CreateTree {
	public boolean createTree(String tree) {
		if (new File(tree).exists()) {
			return true;
		} else {
			return new File(tree).mkdir();
		}
	}
}