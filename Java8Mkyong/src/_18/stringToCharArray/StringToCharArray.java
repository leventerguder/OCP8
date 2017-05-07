package _18.stringToCharArray;

public class StringToCharArray {

	public static void main(String[] args) {

		String password = "password123";

		password.chars().mapToObj(x -> (char) x).forEach(System.out::println);
	}
}
