package ch23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q2 {

	public static void main(String[] args) {

		LocalDateTime pi = LocalDateTime.of(2017, 3, 14, 1, 59);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("m.ddhhMM");
		System.out.println(formatter.format(pi));
		// 59.140103
	}
}

// m -> minute in hour
// d -> day in month
// h -> hour in am/pm
// M -> month in year 