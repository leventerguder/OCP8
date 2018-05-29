package ch23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class QX24 {

	// Assume the /environment directory exists and contains a file with a
	// symbolic link to the /environment directory. In addition, assume all files within
	// the directory are fully accessible. What is the result of executing the
	// following program?

	public static void accessFile(Path p, long timeEpoch) throws IOException {
//		try {
//			// Files.readAttributes(p, BasicFileAttributes.class)
//			// .setTimes(null, null, FileTime.fromMillis(timeEpoch)); //compile
//			// error
//
//			// valid ;
			 BasicFileAttributeView view = Files.getFileAttributeView(p,
			 BasicFileAttributeView.class);
			 BasicFileAttributes data = view.readAttributes();
			
			 FileTime lastModifiedTime =
			 FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
			 view.setTimes(lastModifiedTime, null, null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}