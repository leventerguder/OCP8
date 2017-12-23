package ch04._06.advanced;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class Test03ExceptionCaseStudy {

	private static List<String> create() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) throws IOException {
		Test03ExceptionCaseStudy.create().stream().count();
		
		Supplier<List<String>> s = () -> {
			try {
				return create();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
}
