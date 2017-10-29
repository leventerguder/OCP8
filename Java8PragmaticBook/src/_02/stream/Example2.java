package _02.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("ali","muhammed", "mustafa");
		
		
		//List<String> namesUpperCase=names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		//
		//List<String> namesUpperCase=names.stream().map( (String str) -> str.toUpperCase()).collect(Collectors.toList());
		
		Function<String, String> f = (String str) -> str.toUpperCase();
		
		List<String> namesUpperCase=names.stream().map(f).collect(Collectors.toList());
		
		System.out.println(namesUpperCase);
		
	}
}
