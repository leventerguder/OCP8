package ch19;

import java.nio.file.*;

public class Q3 {

//	public void findHiddenFile(Path p) throws Exception {
//		if (File.isHidden(p)) {  //compile error. watch out it is File !
//			System.out.print("Found!");
//		}
//	} 
	
	public void findHiddenFile(Path p) throws Exception {
		if (Files.isHidden(p)) {  //compile error. watch out it is File !
			System.out.print("Found!");
		}
	} 
}
