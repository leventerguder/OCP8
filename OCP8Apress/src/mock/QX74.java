package mock;

import java.time.LocalDate;
import java.time.Month;

public class QX74 {

	public static void main(String[] args) {
		LocalDate feb28th = LocalDate.of(2015, Month.FEBRUARY, 28);
		System.out.println(feb28th.plusDays(1)); // 2015-03-01
	}
}
