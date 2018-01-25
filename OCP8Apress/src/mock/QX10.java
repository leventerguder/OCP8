package mock;

class OuterQX10 {
	private int mem = 10;

	class Inner {
		private int imem = new OuterQX10().mem; // ACCESS1
	}

	public static void main() {
		System.out.println(new OuterQX10().new Inner().imem); // ACCESS2
	}
}

public class QX10 {

	public static void main(String[] args) {
		OuterQX10.main();
	}
}
