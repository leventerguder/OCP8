package chapter07._01_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
	@SuppressWarnings("finally")
	public static void thrower() throws Exception {
		try {
			throw new IOException();
		} finally {
			throw new FileNotFoundException();
		}
	}

	public static void main(String[] args) {
		try {
			thrower();
		} catch (Throwable throwable) {
			System.out.println(throwable);
		}
	}
}
