package ch05._05.instant;

import java.time.Duration;
import java.time.Instant;

public class Test01Instant {
	// The Instant class represents a speci c moment in time in the GMT time
	// zone

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);

		Instant later = Instant.now();
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
	}
}
