package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class QX10 {

	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("monkey.txt"), Paths.get("/animals"), StandardCopyOption.ATOMIC_MOVE,
				LinkOption.NOFOLLOW_LINKS);
	}
}

// C. If another process is monitoring the file system, it will not see an
// incomplete file at runtime.

// The REPLACE_EXISTING flag was not provided, so if the target exists, it will
// throw an exception at

// the NOFOLLOW_LINKS option means that if the source is a symbolic link, the
// link itself and not the target will be copied at runtime

// if monkey.txt is a file, then the resulting /animals would be a file, not a
// directory.
// Likewise, if the source is a directory, the result would also be a directory