package chapter08._06_duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationTest02 {

	public static void main(String[] args) {
		Duration duration1 = Duration.of(65, ChronoUnit.MINUTES); // PT1H5M
		System.out.println(duration1);
		System.out.println(duration1.getSeconds());
		//

		Duration duration2 = Duration.ofDays(4);
		System.out.println(duration2); // PT96H
		//

		Duration duration3 = Duration.ofHours(2);
		System.out.println(duration3); // PT2H

		//
		Duration duration4 = Duration.ofMinutes(15);
		System.out.println(duration4); // PT15M

		//
		Duration duration5 = Duration.ofSeconds(30);
		System.out.println(duration5); // PT30S
		//

		Duration duration6 = Duration.ofMillis(120);
		System.out.println(duration6); // PT0.12S
		
		//
		
		Duration duration7 = Duration.ofNanos(120);
		System.out.println(duration7);

	}
}
