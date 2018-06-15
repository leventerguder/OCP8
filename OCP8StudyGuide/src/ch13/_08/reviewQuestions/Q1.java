package ch13._08.reviewQuestions;

public class Q1 {
	public static void main(String[] args) {
		final char a = 'A', d = 'D'; // p1
		char grade = 'B';
		switch (grade) {
		case a: // p2
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case d: // p3
		case 'F':
			System.out.print("not good");
		}
		
		//greatgood

	}
}
