package ch12;

public class QX26 {
	public enum Snow {
		BLIZZARD, SQUALL, FLURRY
	}

	public static void main(String[] modelData) {
		System.out.print(Snow.BLIZZARD.ordinal());
		System.out.print(" " + Snow.valueOf("flurry".toUpperCase()).name());
	}
}
