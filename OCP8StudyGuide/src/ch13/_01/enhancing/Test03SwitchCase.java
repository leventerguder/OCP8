package ch13._01.enhancing;

public class Test03SwitchCase {

	// When enum was added in Java 5.0, support was added to switch statements
	// for enum values
	// In Java 7, switch statements were updated further to allow matching on
	// String values

	public static void main(String[] args) {

		int dayOfWeek = 10;
		switch (dayOfWeek) {
		}

		// The variable must actually be marked as final. The new “effectively
		// final” concept in Java 8 is insufficient.
	}

	private int getSortOrder(String firstName, final String lastName) {

		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;

		switch (firstName) {
		case "Test":
			return 52;

//		case middleName: // compile error
//			id = 5;
//			break;
		case suffix:
			id = 0;
			break;
//		case lastName: //compile error
//			id = 8;
//			break;
//  as the final variable is a method argument that can change at runtime			
		default:
			break;
		}

		return id;
	}
}

// int and Integer
// byte and Byte
// short and Short
// char and Character
// String
// enum values