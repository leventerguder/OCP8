package chapter10._06.move;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMoveTest01 {

	public static void main(String[] args) throws IOException {
		//
		Path p1 = Paths.get("move.txt");
		if (!Files.exists(p1))
			Files.createFile(p1);
		PrintWriter pw = new PrintWriter("move.txt");
		pw.println("line1");
		pw.println("line2");
		pw.close();

		Path path2 = Paths.get("movedFile.txt");
		Files.move(p1, path2, StandardCopyOption.REPLACE_EXISTING);
	}
}

// Like the copy() method, the move() method does not overwrite the existing
// destination file unless you specify that it should do so using
// REPLACE_EXISTING.

// If you move a symbolic link, the link itself is moved, not the target file of
// the link. It is important to note that in the case of copy(), if you specify
// a symbolic link, the target of the link is copied, not the link itself.

// You can specify move() as an atomic operation using the ATOMIC_MOVE copy
// option. When you specify an atomic move, you are assured that either the move
// completes successfully or the source continues to be present. If move() is
// performed as a non-atomic operation and it fails while in process, the state
// of both files is unknown and undefined.
