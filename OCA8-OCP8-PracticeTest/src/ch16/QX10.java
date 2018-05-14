package ch16;

public class QX10 {

	// Which statement, when inserted into the main() method of a program,
	// guarantees an
	// AssertionError will be thrown at runtime?
	//
	// A. assert(0,"Invalid");
	// B. assert 0==1;
	// C. assert 0==0;
	// D. None of the above (+)

	public static void main(String[] args) {

		// assert(0,"Invalid");
		assert 0 == 1;
		assert 0 == 0;
	}
}
