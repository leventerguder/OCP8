package ch13._08.reviewQuestions;

public class Q9 {

}

//Which of these lines compile? (Choose all that apply.)
class Rich {
	public void money() {
		int _million=1_000_000;
		// double aThousand=1_000_.00; //compile error
		// double 100=100; //compile error
		// int hundred=100.00; // compile error
		// float ten=10d; // compile error
		short one=1;
	}
}