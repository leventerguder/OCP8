package ch12;

public class QX24 {

}

class Problem extends Exception {
}

abstract class Danger {
	protected abstract void isDanger() throws Problem;
}

//class SeriousDanger extends Danger {
//	protected void isDanger() throws Exception { // m1
//		throw new RuntimeException();
//	}
//}