package ch14;

import java.util.List;
import java.util.ArrayList;

public class QX32 {

//	private Function<String> printer; // compile error
//	
//	protected QX32() {
//		printer = s -> {System.out.println(s); return s;}; // compile error
//	}
	
	void printMovies(List<String> movies) {
		// movies.forEach(printer); //compile error
	}
	
	public static void main(String[] args) {
		List<String> movies = new ArrayList<>();
		movies.add("Stream 3");
		movies.add("Lord of the Recursion");
		movies.add("Silence of the Lambdas");
		new QX32().printMovies(movies);
	}

}
