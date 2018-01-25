package mock;

class BaseQ6 {
	public BaseQ6() {
		System.out.print("Base ");
	}

	public BaseQ6(String s) {
		System.out.print("Base: " + s);
	}
}

class DerivedQ6 extends BaseQ6 {
	public DerivedQ6(String s) {
		// super(); // Stmt-1
		super(s); // Stmt-2
		System.out.print("Derived ");
	}
}

public class Q6 {

	public static void main(String[] args) {
		BaseQ6 a = new DerivedQ6("Hello ");
	}
}
