package ch13._08.reviewQuestions;

public class Q6 {

	public static void main(String[] args) {

		// The code will not compile because of line 7.
		// The code will not compile because of line 9.
		
		final int movieRating = 4;
		int badMovie = 9;

		switch (badMovie) {
		case 0:
		//case badMovie:  //compile errpr
			System.out.println("Awful");
			break;
		case movieRating:
			System.out.println("Great");
			break;
		//case 4: //compile error
		default:
		case (int) 'a':
		case 1 * 1:
			System.out.println("Too be determined");
			break;
		}
	}
}
