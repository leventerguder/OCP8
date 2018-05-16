package ch16;

public class QX18 {

}

interface Closing {
	void close() throws Exception;
}

class Shelf implements Closing {
	public void close() throws Exception {
	}
}

//class Step {
//static {
//try (Shelf shelf = new Shelf()) {
//throws new IllegalArgumentException();
//} catch (Exception e) {
//} catch (IllegalArgumentException e) {
//} finally {
//shelf.close(); }
//}
//}