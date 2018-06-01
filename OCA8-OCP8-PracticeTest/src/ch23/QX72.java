package ch23;

public class QX72 {

}

// How many lines of the following application contain a compilation error?
// B. Two

//final interface Finder {
//	default long find() {
//		return 20;
//	}
//}

abstract class Wanda {
	abstract long find();
}

//final class Waldo extends Wanda implements Finder {
//	long find() {
//		return 40;
//	}
//
//	public static final void main(String[] pictures) {
//		final Finder f = new Waldo();
//		System.out.print(f.find());
//	}
//}