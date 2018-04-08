package chapter06._08_questions;

public class Q1 {

	public static void main(String[] args) {
		"abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).sorted();
	}
	// This code segment terminates normally without printing any output in the console
}

// A stream pipeline is lazily evaluated. Since there is no terminal operation provided 
// such as count() , forEach , reduce , collect 
// This pipeline is not evaluated and hence the peek method does not print any output to the console!