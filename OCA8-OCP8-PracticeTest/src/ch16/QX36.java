package ch16;

import java.io.FileNotFoundException;

class OutOfTuneException extends Exception {
	OutOfTuneException(String message) {
		super(message);
	}
}

public class QX36 {

//	public static void main(String[] args) throws OutOfTuneException {
//		final Piano piano = new Piano();
//		try {
//			piano.play();
//		} catch (Exception e) {
//			throw e; // compile error 
//		} finally {
//			System.out.println("Song finished!");
//		}
//	}
	
	
	public static void main(String[] args) throws OutOfTuneException , FileNotFoundException{
	final Piano piano = new Piano();
		try {
			piano.play();
		} catch (Exception e) {
			throw e; 
		} finally {
			System.out.println("Song finished!");
		}
	}
	
}

class Piano {
	//
	public void play() throws OutOfTuneException, FileNotFoundException {
		throw new OutOfTuneException("Sour note!");
	}
}