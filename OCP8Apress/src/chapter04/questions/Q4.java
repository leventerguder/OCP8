package chapter04.questions;

public class Q4 {

	public static void main(String[] args) {
		"abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).sorted();
		// This program terminates normally without printing any output in the
		// console
	}
}
// A stream pipeline is lazily evaluated. Since there is no terminal operation
// provided , this pipeline is not evaluated and hence the peek does not print
// any output to the console.