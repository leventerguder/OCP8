package chapter08._09_datetimeformatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomTimePatternsTest01 {

	public static void main(String[] args) {
		// patterns from simple to complex ones
		String[] timeFormats = {
				"h:mm", 
				"hh 'o''clock'",
				"H:mm a", "hh:mm:ss:SS", "K:mm:ss a"
		};
		LocalTime now = LocalTime.now();
		for (String timeFormat : timeFormats) {
			System.out.printf("Time in pattern \"%s\" is %s %n", timeFormat,
					DateTimeFormatter.ofPattern(timeFormat).format(now));
		}
	}
}
