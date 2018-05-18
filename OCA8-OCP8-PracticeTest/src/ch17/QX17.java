package ch17;

import java.time.Duration;
import java.time.Period;

public class QX17 {

	public static void main(String[] args) {

		Duration duration = Duration.ofDays(1);
		Period period = Period.ofDays(1);

		// Which statement is not true about these two variables?
		// A. Both output the same value when calling toString(). (+)
		// B. The Duration object compiles because durations are for smaller
		// units of time.
		// C. The Period object compiles because periods are for larger units of
		// time.
		// D. None of the above
		
		System.out.println(duration);
		System.out.println(period);
	}
}
