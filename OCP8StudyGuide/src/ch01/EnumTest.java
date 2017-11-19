package ch01;

enum Season {
	WINTER, SPRING, SUMMER, FALL
}

// public enum ExtendedSeason extends Season { } // DOES NOT COMPILE

public class EnumTest {

	public static void main(String[] args) {
		Season winter = Season.valueOf("WINTER");
		// Season winterIllegal = Season.valueOf("winter"); //
		// java.lang.IllegalArgumentException
		System.out.println(winter.name());
		//

		for (Season s : Season.values()) {
			System.out.println(s.name() + " " + s.ordinal());
		}

	}

}