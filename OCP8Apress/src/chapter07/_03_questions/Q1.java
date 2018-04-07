package chapter07._03_questions;

import java.nio.file.FileSystemException;

class Base {
	public void foo() throws FileSystemException {
		throw new FileSystemException("");
	}
}

class Deri extends Base {
//	public void foo() throws FileSystemException, RuntimeException {
//		throw new NullPointerException();
//	}

//	public void foo() throws AccessDeniedException {
//		throw new AccessDeniedException("");
//	}
}

public class Q1 {

}
