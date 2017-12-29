package chapter08._04_instant;

import java.time.Instant;

public class InstantTest02 {

	public static void main(String[] args) {
		Instant instant = Instant.EPOCH;
		System.out.println(instant);

		Instant instantNow = Instant.now();
		System.out.println(instantNow.getEpochSecond());
		System.out.println(instantNow.toEpochMilli());

	}
}
