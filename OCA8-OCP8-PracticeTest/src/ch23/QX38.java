package ch23;

import java.io.Closeable;
import java.io.IOException;

public class QX38 {

	public static void main(String[] args) {
		
//		try(Suit s = new Suit() , Suit t = new Suit()) { //Watch out comma!
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (StungException e) { } /compile error 
//      finally {}
		
		try(Suit s = new Suit() ; Suit t = new Suit()) { //Watch out comma!
		
		} catch (IOException e) {
		} catch (Exception e) {}
		finally {}
	}
}

class StungException extends Exception {
}

class Suit implements Closeable {
	public void close() throws IOException {
	}
}