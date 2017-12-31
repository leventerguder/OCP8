package ch05._13.reviewQuestions;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class QX15 {

	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString(); // PT1M
		// System.out.println(m1);
		String m2 = Duration.ofMinutes(1).toString(); // PT1M
		System.out.println(m2);

		System.out.println(m1.equals(m2));

		String s = Duration.of(60, ChronoUnit.SECONDS).toString(); // PT1M
		System.out.println(s);
		
		String d = Duration.ofDays(1).toString(); //PT24H
		System.out.println(d);
		
		String p = Period.ofDays(1).toString(); // P1D
		System.out.println(p);
	}
}
