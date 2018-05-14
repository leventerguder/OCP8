package ch16;

public class Q3 {

}

class LostBallException extends Exception {
}

class Ball {
	// D. The code does not compile for a different reason.
	// compiler error
	//	public void toss() throw LostBallException { 
	//		throw new ArrayStoreException();
	//	 }
}