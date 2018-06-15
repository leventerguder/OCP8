package ch13._08.reviewQuestions;

public class Q4 {

	public static void main(String[] args) {
		int x = 10 % 2 + 1;
		
		switch(x) {
		
		// case: 0 System.out.print("Too High"); break;  //compile error
		// case: 1 System.out.print("Just Right"); break; //compile error
		default: System.out.print("Too Low");
		}
		
		// The code will not compile because of lines 5 and 6.
	}
}
