package ch12;

public class Q2 {
	public static void main(String... unused) {
		final DaysOff input = DaysOff.Thanksgiving;
		switch (input) {
		default:
		case ValentinesDay:
			System.out.print("1");
		case PresidentsDay:
			System.out.print("2");
		}
	}
}

enum DaysOff {
	Thanksgiving, PresidentsDay, ValentinesDay
}
