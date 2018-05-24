package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;

public class QX34 {

	public static void organize(Path folder, Path file) throws IOException {
		Path p = folder.resolve(file);
//		BasicFileAttributeView vw = Files.getFileAttributeView(p, BasicFileAttributes.class); //compile error!
//		if (vw.creationTime().toMillis() < System.currentTimeMillis()) { //compile error 
//			vw.setTimes(FileTime.fromMillis(System.currentTimeMillis()), null, null);
//		}
		
	}
}
