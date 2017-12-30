package ch05._03.periods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Test01Epoch {

	public static void main(String[] args) {
		// LocalDate has toEpochDay(), which is the number of days since January
		// 1, 1970.
		LocalDate localDate = LocalDate.now();
		long epochDay = localDate.toEpochDay();
		System.out.println(epochDay);
		//

		LocalDateTime ldt = LocalDateTime.now();
		long epochSecond = ldt.toEpochSecond(ZoneOffset.UTC);
		System.out.println(epochSecond);

	}
}
