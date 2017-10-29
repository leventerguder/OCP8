package _02.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		List<Artist> artist = Arrays.asList(new Artist("name1", "tr"), new Artist("name2", "tr"),
				new Artist("name3", "us"), new Artist("name4", "us"), new Artist("name5", "tr"),
				new Artist("name6", "us"));
		
		Predicate<Artist> p = art -> art.getFrom().equals("tr"); 

		long count=artist.stream().filter(p).count();
		System.out.println(count);
	
		
		Predicate<Artist> p2 = (Artist art) -> {
			return art.getFrom().equals("tr");
		};
		
		List<Artist> collected = artist.stream().filter(p2).collect(Collectors.toList());
		System.out.println(collected);
		
		
		List<String> stringList= Stream.of("name1","name2","name3").collect(Collectors.toList());
		System.out.println(stringList);
	}
	
}
