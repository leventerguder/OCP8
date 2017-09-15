package chapter08._04_instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

	// Suppose you want to trace the execution of a Java application or store
	// the application events in a file. For these purposes, you need to get
	// timestamp values, and you can do so using the java.time.Instant class.
	// The instant values began on January 1, 1970, at 00:00:00 hours (known as
	// the Unix epoch).

	// The Instant class internally uses a long variable that holds the number
	// of seconds since the start of the Unix epoch: 1970-01-01T00:00:00Z

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		//
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		// LocalDateTime uses the default time zone, but Instant doesn’t.

	}
}
