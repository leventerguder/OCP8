package chapter04.questions;

public class Q7 {
	private static boolean removeVowels(int c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		"avada kedavra".chars().filter(Q7::removeVowels).forEach(ch -> System.out.printf("%c", ch));
	}
}
