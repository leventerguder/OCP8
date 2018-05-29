package ch23;

public class Q7 {
	final public static void main(String[] crayons) {
		new ColoringBook().paint(COLORS.green);
	}
}

interface HasHue {
	String getHue();
}

enum COLORS implements HasHue {

	red {
		public String getHue() {
			return "FF0000";
		}
	},
	green {
		public String getHue() {
			return "00FF00";
		}
	},
	blue {
		public String getHue() {
			return "0000FF";
		}
	}

}

class Book {
	static void main(String[] pencils) {
	}
}

final class ColoringBook extends Book {
	final void paint(COLORS c) {
		System.out.print("Painting: " + c.getHue());
	}

}