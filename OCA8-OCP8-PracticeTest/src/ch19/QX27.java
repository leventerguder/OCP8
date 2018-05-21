package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX27 {

	public static void main(String[] args) {

		Paths.get("../sung").getRoot().getParent();

	}
}

// Which of the following statements, when run independently, produces a
// NullPointerException at runtime?

// I. Paths.get("../sang").getParent().getParent()
// II. Paths.get("/sing").getParent().getRoot()
// III. Paths.get("/song").getRoot().getRoot()
// IV. Paths.get("../sung").getRoot().getParent()