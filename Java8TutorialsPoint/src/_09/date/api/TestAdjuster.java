package _09.date.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjuster {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate nextTuesday = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(nextTuesday);
	}
}
