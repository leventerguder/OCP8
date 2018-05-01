package ch09._05.files;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class Test08FilesCharset {

	public static void main(String[] args) {
		//
		System.out.println(Charset.defaultCharset());
		
		SortedMap<String, Charset> map = Charset.availableCharsets();

		map.forEach((String k, Charset v) -> System.out.println(k + " : " + v));
	}
}
