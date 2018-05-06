package ch12;

public class QX36 {
	final public static void main(String[] feed) {
		System.out.print(new BottleQX36().insert.getSize());
	}
}

final class BottleQX36 {

	final private int size = 14;

	final protected class Insert {
		private final int size = 25;

		public final int getSize() {
			// return this.size;
			// BottleQX36.Insert.this;
			return BottleQX36.this.size;
		}
	}

	final Insert insert = new Insert();
}