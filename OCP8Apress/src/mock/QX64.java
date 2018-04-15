package mock;

class Outer64 {
	static class Inner {
		public final String text = "Inner";
	}
}

public class QX64 {
	public static void main(String[] args) {
		System.out.println(new Outer64.Inner().text);
	}
}
