package mock;

class Outer {
	class Inner {
		public void print() {
			System.out.println("Inner: print");
		}
	}
}

public class Q9 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}
}
