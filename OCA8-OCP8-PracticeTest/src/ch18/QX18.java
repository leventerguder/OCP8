package ch18;

import java.io.*;

public class QX18 {

}

//class Guitar {
//	public void readMusic(File f) {  //compile error
//		try (BufferedReader r = new BufferedReader(new FileReader(f))) { //compile error
//			final String music = null;
//			try {
//				while ((music = r.readLine()) != null) //compile error
//					System.out.println(music);
//			} catch (IOException e) {
//			}
//		} catch (FileNotFoundException e) {
//			throw new RuntimeException(e);
//		} finally {
//		}
//	}
//}