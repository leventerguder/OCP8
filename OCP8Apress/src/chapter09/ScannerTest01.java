package chapter09;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write Down : ");
		String str = scanner.next();
		System.out.println(str);
		scanner.close();
	}
}
